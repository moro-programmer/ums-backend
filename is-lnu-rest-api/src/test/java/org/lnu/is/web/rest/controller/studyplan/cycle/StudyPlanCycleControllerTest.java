package org.lnu.is.web.rest.controller.studyplan.cycle;

import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.nio.file.AccessDeniedException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.domain.OrderBy;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.resource.studyplan.cycle.StudyPlanCycleResource;
import org.lnu.is.web.rest.controller.AbstractControllerTest;
import org.lnu.is.web.rest.controller.BaseController;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class StudyPlanCycleControllerTest extends AbstractControllerTest {

	@Mock
	private Facade<StudyPlanCycleResource, Long> facade;

	@InjectMocks
	private StudyPlanCycleController unit;
	
	@Override
	protected BaseController getUnit() {
		return unit;
	}

	@Test
	public void testGetResources() throws Exception {
		// Given
		String name = "Gender Type One";
		StudyPlanCycleResource resource = new StudyPlanCycleResource();
		resource.setName(name);

		List<StudyPlanCycleResource> entities = Arrays.asList(resource);

		Integer offset = 0;
		long count = 1;
		Integer limit = 20;

		PagedResultResource<StudyPlanCycleResource> expected = new PagedResultResource<>("/departments/types");
		expected.setResources(entities);
		expected.setCount(count);
		expected.setLimit(limit);
		expected.setOffset(offset);

		StudyPlanCycleResource paramResource = new StudyPlanCycleResource();
		paramResource.setName(name);
		PagedRequest<StudyPlanCycleResource> request = new PagedRequest<StudyPlanCycleResource>(paramResource, offset, limit, Collections.<OrderBy>emptyList());

		// When
		when(facade.getResources(Matchers.<PagedRequest<StudyPlanCycleResource>> any())).thenReturn(expected);
		String response = getJson(expected, false);

		// Then
		mockMvc.perform(get("/studyplans/cycles")
				.param("name", name))
				.andExpect(status().isOk())
				.andExpect(content().string(response));

		verify(facade).getResources(request);
	}
	
	@Test
	public void testGetResource() throws Exception {
		// Given
		Long id = 1L;
		String name = "all difficult";
		String abbrName = "ad";
		StudyPlanCycleResource expected = new StudyPlanCycleResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);
		expected.setId(id);
		
		// When
		when(facade.getResource(anyLong())).thenReturn(expected);
		String response = getJson(expected, false);

		// Then
		mockMvc.perform(get("/studyplans/cycles/{id}", id))
			.andExpect(status().isOk())
			.andExpect(content().string(response));
		
		verify(facade).getResource(id);
	}

	@Test(expected = AccessDeniedException.class)
	public void testGetResourceWithAccessDeniedException() throws Exception {
		// Given
		Long id = 1L;
		
		// When
		doThrow(AccessDeniedException.class).when(facade).getResource(anyLong());
		
		// Then
		mockMvc.perform(get("/studyplans/cycles/{id}", id));
		
		verify(facade).getResource(id);
	}	
}
