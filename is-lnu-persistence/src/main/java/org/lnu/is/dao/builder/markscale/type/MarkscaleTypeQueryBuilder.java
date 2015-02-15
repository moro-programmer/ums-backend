package org.lnu.is.dao.builder.markscale.type;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.markscale.type.MarkscaleType;

/**
 * Query builder for Markscale Type.
 * 
 * @author OlehZanevych
 *
 */

@QBuilder("markscaleTypeQueryBuilder")
public class MarkscaleTypeQueryBuilder extends AbstractQueryBuilder<MarkscaleType> {
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "e.abbrName LIKE CONCAT('%',:abbrName,'%') ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM MarkscaleType e %s";
	}

	@Override
	protected BaseQueryBuilder build(final MarkscaleType context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.closeBracket();
	}

}