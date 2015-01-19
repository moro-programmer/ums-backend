package org.lnu.is.converter.gendertype;

import org.lnu.is.annotations.ResourceConverter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.gendertype.GenderType;
import org.lnu.is.resource.gendertype.GenderTypeResource;

/**
 * Gender Type Resource Converter.
 * 
 * @author kushnir
 *
 */
@ResourceConverter("genderTypeResourceConverter")
public class GenderTypeResourceConverter extends AbstractConverter<GenderTypeResource, GenderType> {

	@Override
	public GenderType convert(final GenderTypeResource source, final GenderType target) {

		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());

		return target;
	}

	@Override
	public GenderType convert(final GenderTypeResource source) {
		return convert(source, new GenderType());
	}

}
