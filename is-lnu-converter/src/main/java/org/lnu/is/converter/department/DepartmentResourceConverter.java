package org.lnu.is.converter.department;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.department.type.DepartmentType;
import org.lnu.is.domain.order.Order;
import org.lnu.is.resource.department.DepartmentResource;

/**
 * Converter, that converts from DepartmentResource to Department.
 * @author ivanursul
 *
 */
@Converter("departmentResourceConverter")
public class DepartmentResourceConverter extends AbstractConverter<DepartmentResource, Department> {

	@Override
	public Department convert(final DepartmentResource source, final Department target) {

		if (source.getDepartmentTypeId() != null) {
			DepartmentType departmentType = new DepartmentType();
			departmentType.setId(source.getDepartmentTypeId());
			
			target.setDepartmentType(departmentType);
		}
		
		if (source.getParentId() != null) {
			Department parent = new Department();
			parent.setId(source.getParentId());
			target.setParent(parent);
		}

		if (source.getOrderId() != null) {
			Order order = new Order();
			order.setId(source.getOrderId());
			
			target.setOrder(order);
		}
		
		target.setEndDate(source.getEndDate());
		target.setBegDate(source.getBegDate());
		target.setAbbrName(source.getAbbrName());
		target.setManager(source.getManager());
		target.setName(source.getName());
		target.setIdentifir(source.getIdentifir());
		
		return target;
	}

	@Override
	public Department convert(final DepartmentResource source) {
		return convert(source, new Department());
	}

}
