package org.lnu.is.extractor.honor.type;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.lnu.is.domain.honorstype.HonorType;

public class HonorTypeParametersExtractorTest {

	private HonorTypeParametersExtractor unit = new HonorTypeParametersExtractor();

	@Test
	public void testGetParameters() throws Exception {
		// Given
		HonorType entity = new HonorType();
		String name = "first blood";
		String abbrName = "fb";

		entity.setName(name);
		entity.setAbbrName(abbrName);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("name", name);
		expected.put("abbrName", abbrName);

		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
}