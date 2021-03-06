package org.lnu.is.dao.builder.specoffer.wave;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.domain.specoffer.SpecOfferWave;
import org.lnu.is.domain.wave.type.WaveType;
import org.lnu.is.pagination.MultiplePagedSearch;

public class SpecOfferWaveQueryBuilderTest {

	private SpecOfferWaveQueryBuilder unit = new SpecOfferWaveQueryBuilder();
	
	private Boolean active = true;
	private Boolean security = true;
	
	@Before
	public void setup() {
		unit.setActive(active);
		unit.setSecurity(security);
	}

	@Test
	public void testBuild() throws Exception {
		// Given
		SpecOfferWave context = new SpecOfferWave();

		String expectedQuery = "SELECT e FROM SpecOfferWave e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<SpecOfferWave> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledSecurityConstraint() throws Exception {
		// Given
		unit.setSecurity(false);
		SpecOfferWave context = new SpecOfferWave();
		
		String expectedQuery = "SELECT e FROM SpecOfferWave e WHERE e.status=:status ";
		MultiplePagedSearch<SpecOfferWave> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledStatusConstraint() throws Exception {
		// Given
		unit.setActive(false);
		SpecOfferWave context = new SpecOfferWave();
		
		String expectedQuery = "SELECT e FROM SpecOfferWave e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<SpecOfferWave> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledDefaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		SpecOfferWave context = new SpecOfferWave();
		
		String expectedQuery = "SELECT e FROM SpecOfferWave e ";
		MultiplePagedSearch<SpecOfferWave> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildEmptyParameters() throws Exception {
		// Given
		SpecOffer specOffer = new SpecOffer();
		WaveType waveType = new WaveType();
		Integer licCount = 1;
		Integer stateCount = 2;
		Integer targetCount = 3;
		Integer benefitCount = 4;
		Date date = new Date();
		
		SpecOfferWave context = new SpecOfferWave();
		context.setSpecOffer(specOffer);
		context.setWaveType(waveType);
		context.setLicCount(licCount);
		context.setStateCount(stateCount);
		context.setTargetCount(targetCount);
		context.setBenefitCount(benefitCount);
		context.setBeginDate(date);
		context.setEndDate(date);
		
		String expectedQuery = "SELECT e FROM SpecOfferWave e WHERE ( e.specOffer = :specOffer AND e.waveType = :waveType AND e.licCount =:licCount AND e.stateCount =:stateCount AND e.benefitCount =:benefitCount AND e.targetCount =:targetCount AND e.beginDate >=:beginDate AND e.endDate <=:endDate ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<SpecOfferWave> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildEmptyParametersWithDisabledDefaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		SpecOffer specOffer = new SpecOffer();
		WaveType waveType = new WaveType();
		Integer licCount = 1;
		Integer stateCount = 2;
		Integer targetCount = 3;
		Integer benefitCount = 4;
		Date date = new Date();
		
		SpecOfferWave context = new SpecOfferWave();
		context.setSpecOffer(specOffer);
		context.setWaveType(waveType);
		context.setLicCount(licCount);
		context.setStateCount(stateCount);
		context.setTargetCount(targetCount);
		context.setBenefitCount(benefitCount);
		context.setBeginDate(date);
		context.setEndDate(date);
		
		String expectedQuery = "SELECT e FROM SpecOfferWave e WHERE ( e.specOffer = :specOffer AND e.waveType = :waveType AND e.licCount =:licCount AND e.stateCount =:stateCount AND e.benefitCount =:benefitCount AND e.targetCount =:targetCount AND e.beginDate >=:beginDate AND e.endDate <=:endDate ) ";
		MultiplePagedSearch<SpecOfferWave> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
