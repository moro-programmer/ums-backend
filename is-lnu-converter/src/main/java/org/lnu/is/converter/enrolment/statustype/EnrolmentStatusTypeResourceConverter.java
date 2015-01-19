package org.lnu.is.converter.enrolment.statustype;

import org.lnu.is.annotations.ResourceConverter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.enrolment.EnrolmentStatusType;
import org.lnu.is.resource.enrolment.statustype.EnrolmentStatusTypeResource;

/**
 * Enrolment Status Type Resource Converter.
 * 
 * @author kushnir
 *
 */

@ResourceConverter("enrolmentStatusTypeResourceConverter")
public class EnrolmentStatusTypeResourceConverter extends AbstractConverter<EnrolmentStatusTypeResource, EnrolmentStatusType> {

	@Override
	public EnrolmentStatusType convert(final EnrolmentStatusTypeResource source, final EnrolmentStatusType target) {

		target.setAbbrName(source.getAbbrName());
		target.setName(source.getName());
		target.setDescription(source.getDescription());

		return target;
	}

	@Override
	public EnrolmentStatusType convert(final EnrolmentStatusTypeResource source) {
		return convert(source, new EnrolmentStatusType());
	}

}
