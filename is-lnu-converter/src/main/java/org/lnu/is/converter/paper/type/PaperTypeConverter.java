package org.lnu.is.converter.paper.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.paper.type.PaperType;
import org.lnu.is.resource.paper.type.PaperTypeResource;

/**
 * Paper Type Converter.
 * 
 * @author ivanursul
 *
 */

@Converter("paperTypeConverter")
public class PaperTypeConverter extends AbstractConverter<PaperType, PaperTypeResource> {

	@Override
	public PaperTypeResource convert(final PaperType source, final PaperTypeResource target) {

		target.setId(source.getId());
		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());
		
		if (source.getPaperUsage() != null) {
			target.setPaperUsageId(source.getPaperUsage().getId());
		}

		return target;
	}

	@Override
	public PaperTypeResource convert(final PaperType source) {	
		return convert(source, new PaperTypeResource());
	}

}
