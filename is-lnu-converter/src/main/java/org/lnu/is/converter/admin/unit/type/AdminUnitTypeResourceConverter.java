package org.lnu.is.converter.admin.unit.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.admin.unit.type.AdminUnitType;
import org.lnu.is.resource.adminunit.type.AdminUnitTypeResource;

/**
 * Admin unit type resource converter.
 * @author ivanursul
 *
 */
@Converter("adminUnitTypeResourceConverter")
public class AdminUnitTypeResourceConverter extends AbstractConverter<AdminUnitTypeResource, AdminUnitType> {

	@Override
	public AdminUnitType convert(final AdminUnitTypeResource source, final AdminUnitType target) {
		
		target.setAbbrName(source.getAbbrName());
		target.setName(source.getName());
		
		return target;
	}

	@Override
	public AdminUnitType convert(final AdminUnitTypeResource source) {
		return convert(source, new AdminUnitType());
	}

}
