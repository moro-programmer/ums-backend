package org.lnu.is.dao.builder.department;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.department.Department;

/**
 * Department Query Builder.
 * @author ivanursul
 *
 */
@QBuilder("departmentQueryBuilder")
public class DepartmentQueryBuilder extends AbstractQueryBuilder<Department> {
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";
	private static final String PARENT_CONDITION = "e.parent = :parent ";
	private static final String DEPARTMENTTYPE_CONDITION = "e.departmentType = :departmentType ";
	private static final String ORDER_CONDITION = "e.order = :order ";
	private static final String ABBRNAME_CONDITION = "e.abbrName LIKE CONCAT('%',:abbrName,'%') ";
	private static final String MANAGER_CONDITION = "e.manager LIKE CONCAT('%',:manager,'%') ";
	private static final String BEGDATE_CONDITION = "e.begDate <= :begDate ";
	private static final String ENDDATE_CONDITION = "e.endDate >= :endDate";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM Department e %s";
	}

	@Override
	protected BaseQueryBuilder build(final Department context, final BaseQueryBuilder builder) {
		return builder	
				.where()
				.openBracket()
				.addOrCondition(PARENT_CONDITION, context.getParent())
				.addOrCondition(DEPARTMENTTYPE_CONDITION, context.getDepartmentType())
				.addOrCondition(ORDER_CONDITION, context.getOrder())
				.addOrCondition(ABBRNAME_CONDITION, context.getAbbrName())
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(MANAGER_CONDITION, context.getManager())
				.addOrCondition(BEGDATE_CONDITION, context.getBegDate())
				.addOrCondition(ENDDATE_CONDITION, context.getEndDate())
				.closeBracket();
	}


}
