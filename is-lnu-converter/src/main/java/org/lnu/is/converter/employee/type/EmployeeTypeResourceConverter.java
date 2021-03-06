package org.lnu.is.converter.employee.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.employee.type.EmployeeType;
import org.lnu.is.resource.employee.type.EmployeeTypeResource;

/**
 * Employee Type Resource Converter.
 * 
 * @author ivanursul
 *
 */
@Converter("employeeTypeResourceConverter")
public class EmployeeTypeResourceConverter extends AbstractConverter<EmployeeTypeResource, EmployeeType> {

	@Override
	public EmployeeType convert(final EmployeeTypeResource source, final EmployeeType target) {

		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());

		return target;
	}

	@Override
	public EmployeeType convert(final EmployeeTypeResource source) {
		return convert(source, new EmployeeType());
	}
}
