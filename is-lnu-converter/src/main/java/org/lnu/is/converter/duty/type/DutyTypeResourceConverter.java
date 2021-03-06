package org.lnu.is.converter.duty.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.duty.type.DutyType;
import org.lnu.is.resource.duty.type.DutyTypeResource;

/**
 * Duty Type Resource Converter.
 * 
 * @author ivanursul
 *
 */
@Converter("dutyTypeResourceConverter")
public class DutyTypeResourceConverter extends AbstractConverter<DutyTypeResource, DutyType> {

	@Override
	public DutyType convert(final DutyTypeResource source, final DutyType target) {

		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());

		return target;
	}

	@Override
	public DutyType convert(final DutyTypeResource source) {
		return convert(source, new DutyType());
	}
}
