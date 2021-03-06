/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portlet.timesheet.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the timesheet task segment local service. This utility wraps {@link com.liferay.portlet.timesheet.service.impl.TimesheetTaskSegmentLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Mate Thurzo
 * @see TimesheetTaskSegmentLocalService
 * @see com.liferay.portlet.timesheet.service.base.TimesheetTaskSegmentLocalServiceBaseImpl
 * @see com.liferay.portlet.timesheet.service.impl.TimesheetTaskSegmentLocalServiceImpl
 * @generated
 */
public class TimesheetTaskSegmentLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.portlet.timesheet.service.impl.TimesheetTaskSegmentLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the timesheet task segment to the database. Also notifies the appropriate model listeners.
	*
	* @param timesheetTaskSegment the timesheet task segment
	* @return the timesheet task segment that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.timesheet.model.TimesheetTaskSegment addTimesheetTaskSegment(
		com.liferay.portlet.timesheet.model.TimesheetTaskSegment timesheetTaskSegment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addTimesheetTaskSegment(timesheetTaskSegment);
	}

	/**
	* Creates a new timesheet task segment with the primary key. Does not add the timesheet task segment to the database.
	*
	* @param segmentId the primary key for the new timesheet task segment
	* @return the new timesheet task segment
	*/
	public static com.liferay.portlet.timesheet.model.TimesheetTaskSegment createTimesheetTaskSegment(
		long segmentId) {
		return getService().createTimesheetTaskSegment(segmentId);
	}

	/**
	* Deletes the timesheet task segment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param segmentId the primary key of the timesheet task segment
	* @return the timesheet task segment that was removed
	* @throws PortalException if a timesheet task segment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.timesheet.model.TimesheetTaskSegment deleteTimesheetTaskSegment(
		long segmentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteTimesheetTaskSegment(segmentId);
	}

	/**
	* Deletes the timesheet task segment from the database. Also notifies the appropriate model listeners.
	*
	* @param timesheetTaskSegment the timesheet task segment
	* @return the timesheet task segment that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.timesheet.model.TimesheetTaskSegment deleteTimesheetTaskSegment(
		com.liferay.portlet.timesheet.model.TimesheetTaskSegment timesheetTaskSegment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteTimesheetTaskSegment(timesheetTaskSegment);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static com.liferay.portlet.timesheet.model.TimesheetTaskSegment fetchTimesheetTaskSegment(
		long segmentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchTimesheetTaskSegment(segmentId);
	}

	/**
	* Returns the timesheet task segment with the primary key.
	*
	* @param segmentId the primary key of the timesheet task segment
	* @return the timesheet task segment
	* @throws PortalException if a timesheet task segment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.timesheet.model.TimesheetTaskSegment getTimesheetTaskSegment(
		long segmentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getTimesheetTaskSegment(segmentId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the timesheet task segments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of timesheet task segments
	* @param end the upper bound of the range of timesheet task segments (not inclusive)
	* @return the range of timesheet task segments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.timesheet.model.TimesheetTaskSegment> getTimesheetTaskSegments(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTimesheetTaskSegments(start, end);
	}

	/**
	* Returns the number of timesheet task segments.
	*
	* @return the number of timesheet task segments
	* @throws SystemException if a system exception occurred
	*/
	public static int getTimesheetTaskSegmentsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTimesheetTaskSegmentsCount();
	}

	/**
	* Updates the timesheet task segment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param timesheetTaskSegment the timesheet task segment
	* @return the timesheet task segment that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.timesheet.model.TimesheetTaskSegment updateTimesheetTaskSegment(
		com.liferay.portlet.timesheet.model.TimesheetTaskSegment timesheetTaskSegment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTimesheetTaskSegment(timesheetTaskSegment);
	}

	/**
	* Updates the timesheet task segment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param timesheetTaskSegment the timesheet task segment
	* @param merge whether to merge the timesheet task segment with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the timesheet task segment that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.timesheet.model.TimesheetTaskSegment updateTimesheetTaskSegment(
		com.liferay.portlet.timesheet.model.TimesheetTaskSegment timesheetTaskSegment,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateTimesheetTaskSegment(timesheetTaskSegment, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	/**
	* NOTE FOR DEVELOPERS:
	*
	* Never reference this interface directly. Always use {@link com.liferay.portlet.timesheet.service.TimesheetTaskSegmentLocalServiceUtil} to access the timesheet task segment local service.
	*/
	public static com.liferay.portlet.timesheet.model.TimesheetTaskSegment addTaskSegment(
		long taskId, java.util.Date startDate, java.util.Date endDate)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().addTaskSegment(taskId, startDate, endDate);
	}

	public static com.liferay.portlet.timesheet.model.TimesheetTaskSegment updateEndDate(
		long segmentId, java.util.Date endDate)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().updateEndDate(segmentId, endDate);
	}

	public static void clearService() {
		_service = null;
	}

	public static TimesheetTaskSegmentLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					TimesheetTaskSegmentLocalService.class.getName());

			if (invokableLocalService instanceof TimesheetTaskSegmentLocalService) {
				_service = (TimesheetTaskSegmentLocalService)invokableLocalService;
			}
			else {
				_service = new TimesheetTaskSegmentLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(TimesheetTaskSegmentLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(TimesheetTaskSegmentLocalService service) {
	}

	private static TimesheetTaskSegmentLocalService _service;
}