package org.lnu.is.converter.contact.type;

import org.lnu.is.annotations.ResourceConverter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.contacttype.ContactType;
import org.lnu.is.resource.contact.type.ContactTypeResource;

/**
 * Contact Type Converter.
 * 
 * @author ivanursul
 * 
 */
@ResourceConverter("contactTypeConverter")
public class ContactTypeConverter extends AbstractConverter<ContactType, ContactTypeResource> {

	@Override
	public ContactTypeResource convert(final ContactType source, final ContactTypeResource target) {

		target.setId(source.getId());
		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());

		return target;
	}

	@Override
	public ContactTypeResource convert(final ContactType source) {
		return convert(source, new ContactTypeResource());
	}

}
