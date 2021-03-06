package org.lnu.is.converter.asset.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.asset.type.AssetType;
import org.lnu.is.resource.asset.type.AssetTypeResource;

public class AssetTypeConverterTest {

	private AssetTypeConverter unit = new AssetTypeConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long id = 1L;
		String name = "name";
		String abbrName = "abbrname";
		AssetType source = new AssetType();
		source.setAbbrName(abbrName);
		source.setName(name);
		source.setId(id);
		
		AssetTypeResource expected = new AssetTypeResource();
		expected.setAbbrName(abbrName);
		expected.setId(id);
		expected.setName(name);
		
		// When
		AssetTypeResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		AssetType source = new AssetType();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<AssetType> sources = Arrays.asList(source); 
		
		AssetTypeResource expected = new AssetTypeResource();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<AssetTypeResource> expecteds = Arrays.asList(expected);
		
		// Where
		List<AssetTypeResource> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
