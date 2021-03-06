package org.lnu.is.dao.builder.specoffer;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.specoffer.SpecOffer;

/**
 * Spec Offer Query Builder.
 * @author ivanursul
 *
 */
@QBuilder("specOfferQueryBuilder")
public class SpecOfferQueryBuilder extends AbstractQueryBuilder<SpecOffer> {
	private static final String PARENT_CONDITION = "e.parent = :parent ";
	private static final String SPECIALTY_CONDITION = "e.specialty = :specialty ";
	private static final String DEPARTMENT_CONDITION = "e.department = :department ";
	private static final String TIMEPERIOD_CONDITION = "e.timePeriod = :timePeriod ";
	private static final String EDUFORMTYPE_CONDITION = "e.educationFormType = :educationFormType ";
	private static final String SPECOFFERTYPE_CONDITION = "e.specOfferType :specOfferType ";
	private static final String DOCSERIES_CONDITION = "e.docSeries LIKE CONCAT('%',:docSeries,'%') ";
	private static final String DOCNUM_CONDITION = "e.docNum LIKE CONCAT('%',:docNum,'%') ";
	private static final String LICCOUNT_CONDITION = "e.licCount = :licCount ";
	private static final String STATECOUNT_CONDITION = "e.stateCount = :stateCount ";
	private static final String BEGDATE_CONDITION = "e.begDate <= :begDate ";
	private static final String ENDDATE_CONDITION = "e.endDate >= :endDate ";
	private static final String TIMEPERIODCOURSE_CONDITION = "e.timePeriodCourse = :timePeriodCourse ";
	private static final String DURATION_CONDITION = "e.duration = :duration ";
	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM SpecOffer e %s";
	}

	@Override
	protected BaseQueryBuilder build(final SpecOffer context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addAndCondition(PARENT_CONDITION, context.getParent())
					.addAndCondition(SPECIALTY_CONDITION, context.getSpecialty())
					.addAndCondition(DEPARTMENT_CONDITION, context.getDepartment())
					.addAndCondition(TIMEPERIOD_CONDITION, context.getTimePeriod())
					.addAndCondition(TIMEPERIODCOURSE_CONDITION, context.getTimePeriodCourse())
					.addAndCondition(EDUFORMTYPE_CONDITION, context.getEducationFormType())
					.addAndCondition(SPECOFFERTYPE_CONDITION, context.getSpecOfferType())
					.addAndCondition(DOCSERIES_CONDITION, context.getDocSeries())
					.addAndCondition(DOCNUM_CONDITION, context.getDocNum())
					.addAndCondition(LICCOUNT_CONDITION, context.getLicCount())
					.addAndCondition(STATECOUNT_CONDITION, context.getStateCount())
					.addAndCondition(BEGDATE_CONDITION, context.getBegDate())
					.addAndCondition(ENDDATE_CONDITION, context.getEndDate())
					.addAndCondition(DURATION_CONDITION, context.getDuration())
				.closeBracket();
	}

}
