package org.lnu.is.web.rest.controller.enrolment.subject;

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
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.resource.enrolment.subject.EnrolmentSubjectResource;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.web.rest.controller.AbstractControllerTest;
import org.lnu.is.web.rest.controller.BaseController;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EnrolmentSubjectControllerTest extends AbstractControllerTest {

    @Mock
    private Facade<EnrolmentSubjectResource, EnrolmentSubjectResource, Long> facade;

    @InjectMocks
    private EnrolmentSubjectController unit;

    @Override
    protected BaseController getUnit() {
	return unit;
    }

    @Test
    public void testGetEnrolmentSubjects() throws Exception {
	// Given
	String name = "Ua lan";
	String abbrName = "ua";
	EnrolmentSubjectResource resource = new EnrolmentSubjectResource();
	resource.setAbbrName(abbrName);
	resource.setName(name);

	List<EnrolmentSubjectResource> entities = Arrays.asList(resource);

	Integer offset = 0;
	long count = 1;
	Integer limit = 43;
	PagedResultResource<EnrolmentSubjectResource> expected = new PagedResultResource<>(
		"/enrolments/subjects");
	expected.setResources(entities);
	expected.setCount(count);
	expected.setLimit(limit);
	expected.setOffset(offset);

	EnrolmentSubjectResource paramResource = new EnrolmentSubjectResource();
	paramResource.setName(name);
	PagedRequest<EnrolmentSubjectResource> request = new PagedRequest<EnrolmentSubjectResource>(
		paramResource, offset, limit, Collections.<OrderBy> emptyList());

	// When
	when(
		facade.getResources(Matchers
			.<PagedRequest<EnrolmentSubjectResource>> any()))
		.thenReturn(expected);
	String response = getJson(expected, false);

	// Then
	mockMvc.perform(get("/enrolments/subjects").param("name", name))
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
	EnrolmentSubjectResource expected = new EnrolmentSubjectResource();
	expected.setName(name);
	expected.setAbbrName(abbrName);
	expected.setId(id);

	// When
	when(facade.getResource(anyLong())).thenReturn(expected);
	String response = getJson(expected, false);

	// Then
	mockMvc.perform(get("/enrolments/subjects/{id}", id))
		.andExpect(status().isOk())
		.andExpect(content().string(response));

	verify(facade).getResource(id);
    }

    @Test(expected = AccessDeniedException.class)
    public void testGetResourceWithAccessDeniedException() throws Exception {
	// Given
	Long id = 1L;

	// When
	doThrow(AccessDeniedException.class).when(facade)
		.getResource(anyLong());

	// Then
	mockMvc.perform(get("/enrolments/subjects/{id}", id));

	verify(facade).getResource(id);
    }
}
