package org.lnu.is.service.enrolment.subject;

import org.lnu.is.domain.enrolment.EnrolmentSubject;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.Service;

/**
 * Enrolment Subject Service.
 * @author ivanursul
 *
 */
public interface EnrolmentSubjectService extends Service<EnrolmentSubject> {

	/**
	 * Method for getting all enrolment subjects.
	 * @author ivanursul
	 * @param pagedSearch
	 * @return paged result.
	 */
	PagedResult<EnrolmentSubject> getEnrolmentSubjects(PagedSearch<EnrolmentSubject> pagedSearch);

}