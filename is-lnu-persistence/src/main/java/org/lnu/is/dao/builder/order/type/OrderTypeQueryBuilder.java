package org.lnu.is.dao.builder.order.type;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.order.type.OrderType;

/**
 * OrderType Query Builder.
 * @author ivanursul
 *
 */
@QBuilder("orderTypeQueryBuilder")
public class OrderTypeQueryBuilder extends AbstractQueryBuilder<OrderType> {
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";
	private static final String ABBR_NAME_CONDITION = "e.abbrName LIKE CONCAT('%',:abbrName,'%') ";
	private static final String PARENT_CONDITION = "e.parent = :parent ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM OrderType e %s";
	}

	@Override
	protected BaseQueryBuilder build(final OrderType context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addAndCondition(PARENT_CONDITION, context.getParent())
					.addAndCondition(NAME_CONDITION, context.getName())
					.addAndCondition(ABBR_NAME_CONDITION, context.getAbbrName())
				.closeBracket();
	}
}
