package org.lnu.is.dao.builder.partner;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.partner.Partner;

/**
 * Partner query builder.
 * @author ivanursul
 *
 */
@QBuilder("partnerQueryBuilder")
public class PartnerQueryBuilder extends AbstractQueryBuilder<Partner> {
	private static final String PARENT_CONDITION = "e.parent = :parent ";
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";
	private static final String BEGDATE_CONDITION = "e.begDate <= :begDate ";
	private static final String ENDDATE_CONDITION = "e.endDate >= :endDate ";
	private static final String ABBRNAME_CONDITION = "e.abbrName LIKE CONCAT('%',:abbrName,'%') ";
	private static final String MANAGER_CONDITION = "e.manager LIKE CONCAT('%',:manager,'%') ";
	private static final String PHONE_CONDITION = "e.phone LIKE CONCAT('%',:phone,'%') ";
	private static final String EMAIL_CONDITION = "e.email LIKE CONCAT('%',:email,'%') ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM Partner e %s";
	}

	@Override
	protected BaseQueryBuilder build(final Partner context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addAndCondition(PARENT_CONDITION, context.getParent())
					.addAndCondition(ABBRNAME_CONDITION, context.getAbbrName())
					.addAndCondition(NAME_CONDITION, context.getName())
					.addAndCondition(MANAGER_CONDITION, context.getManager())
					.addAndCondition(PHONE_CONDITION, context.getPhone())
					.addAndCondition(EMAIL_CONDITION, context.getEmail())
					.addAndCondition(BEGDATE_CONDITION, context.getBegDate())
					.addAndCondition(ENDDATE_CONDITION, context.getEndDate())
				.closeBracket();
	}

}
