package org.lnu.is.dao.builder.benefit.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.benefit.BenefitType;

public class BenefitTypeQueryBuilderTest {

	private BenefitTypeQueryBuilder unit = new BenefitTypeQueryBuilder();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		BenefitType context = new BenefitType();
		
		String expected = "SELECT e FROM BenefitType e ";
		
		// When
		String actual = unit.build(context);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertWithParameters() throws Exception {
		// Given
		String name = "name";
		Integer priority = 2;

		BenefitType context = new BenefitType();
		context.setName(name);
		context.setPriority(priority);
		
		String expected = "SELECT e FROM BenefitType e WHERE e.name LIKE CONCAT('%',:name,'%') OR e.priority =:priority ";
		
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}
}
