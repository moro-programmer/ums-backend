package org.lnu.is.extractor.operationtype;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.lnu.is.domain.optype.OperationType;

public class OperationTypeParametersExtractorTest {

	private OperationTypeParametersExtractor unit = new OperationTypeParametersExtractor();

	@Test
	public void testGetParameters() throws Exception {
		// Given
		String name = "yoyo";
		String abbrName = "yo";

		OperationType entity = new OperationType();
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