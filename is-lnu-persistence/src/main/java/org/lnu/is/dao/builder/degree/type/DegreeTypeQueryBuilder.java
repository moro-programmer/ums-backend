package org.lnu.is.dao.builder.degree.type;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.degree.type.DegreeType;

/**
 * Query builder for Degree Type.
 * 
 * @author ivanursul
 *
 */

@QBuilder("degreeTypeQueryBuilder")
public class DegreeTypeQueryBuilder extends AbstractQueryBuilder<DegreeType> {
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "e.abbrName LIKE CONCAT('%',:abbrName,'%') ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM DegreeType e %s";
	}

	@Override
	protected BaseQueryBuilder build(final DegreeType context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addAndCondition(NAME_CONDITION, context.getName())
					.addAndCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.closeBracket();
	}

}
