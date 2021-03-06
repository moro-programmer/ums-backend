package org.lnu.is.dao.builder.married.type;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.married.type.MarriedType;

/**
 * Query builder for Married Type.
 * @author Bohdan
 *
 */
@QBuilder("marriedTypeQueryBuilder")
public class MarriedTypeQueryBuilder extends AbstractQueryBuilder<MarriedType> {
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "e.abbrName LIKE CONCAT('%',:abbrName,'%') ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM MarriedType e %s";
	}

	@Override
	protected BaseQueryBuilder build(final MarriedType context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addAndCondition(NAME_CONDITION, context.getName())
					.addAndCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.closeBracket();
	}

}
