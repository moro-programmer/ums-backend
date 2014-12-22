package org.lnu.is.facade.converter.asset.status;

import org.lnu.is.domain.asset.AssetStatus;
import org.lnu.is.facade.annotations.Converter;
import org.lnu.is.facade.converter.AbstractConverter;
import org.lnu.is.facade.resource.asset.status.AssetStatusResource;

/**
 * Asset state converter.
 * @author ivanursul
 *
 */
@Converter("assetStatusConverter")
public class AssetStatusConverter extends AbstractConverter<AssetStatus, AssetStatusResource> {

	@Override
	public AssetStatusResource convert(final AssetStatus source, final AssetStatusResource target) {
		
		target.setName(source.getName());
		target.setId(source.getId());
		
		return target;
	}

	@Override
	public AssetStatusResource convert(final AssetStatus source) {
		return convert(source, new AssetStatusResource());
	}

}