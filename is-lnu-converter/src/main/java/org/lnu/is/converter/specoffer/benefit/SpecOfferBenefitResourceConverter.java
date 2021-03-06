package org.lnu.is.converter.specoffer.benefit;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.benefit.Benefit;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.domain.specoffer.SpecOfferBenefit;
import org.lnu.is.resource.specoffer.benefit.SpecOfferBenefitResource;

/**
 * Spec Offer Resource Converter.
 * @author ivanursul
 *
 */
@Converter("specOfferBenefitResourceConverter")
public class SpecOfferBenefitResourceConverter extends AbstractConverter<SpecOfferBenefitResource, SpecOfferBenefit> {

	@Override
	public SpecOfferBenefit convert(final SpecOfferBenefitResource source, final SpecOfferBenefit target) {
		
		if (source.getBenefitId() != null) {
			Benefit benefit = new Benefit();
			benefit.setId(source.getBenefitId());
			target.setBenefit(benefit);
		}
		
		if (source.getSpecOfferId() != null) {
			SpecOffer specOffer = new SpecOffer();
			specOffer.setId(source.getSpecOfferId());
			target.setSpecOffer(specOffer);
		}
		
		return target;
	}

	@Override
	public SpecOfferBenefit convert(final SpecOfferBenefitResource source) {
		return convert(source, new SpecOfferBenefit());
	}

}
