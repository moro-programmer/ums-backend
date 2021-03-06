package org.lnu.is.web.rest.controller.person.address;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.nio.file.AccessDeniedException;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.person.address.PersonAddressResource;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.web.rest.controller.AbstractControllerTest;
import org.lnu.is.web.rest.controller.BaseController;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.MediaType;

@RunWith(MockitoJUnitRunner.class)
public class PersonAddressControllerTest extends AbstractControllerTest {

	@Mock
	private Facade<PersonAddressResource, PersonAddressResource, Long> facade;
	
	@InjectMocks
	private PersonAddressController unit;
	
	@Override
	protected BaseController getUnit() {
		return unit;
	}

    @Test
	public void testCreatePersonAddress() throws Exception {
		// Given
    	Long personId = 1L;
    	Long id = 2L;
    	PersonAddressResource personAddressResource = new PersonAddressResource();
    	personAddressResource.setId(id);
		
		// When
    	String request = getJson(personAddressResource, true);
		String response = getJson(personAddressResource, false);
    	
		when(facade.createResource(any(PersonAddressResource.class))).thenReturn(personAddressResource);
		
    	// Then
		mockMvc.perform(post("/persons/{personId}/addresses", personId)
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isCreated())
				.andExpect(content().string(response));
		
		verify(facade).createResource(personAddressResource);
	}
    
    @Test
	public void testUpdatePersonAddress() throws Exception {
		// Given
    	Long personId = 2L;
    	Long id = 1L;
    	
    	PersonAddressResource personAddressResource = new PersonAddressResource();
    	personAddressResource.setId(id);
    	personAddressResource.setPersonId(personId);
    	
		MessageResource responseResource = new MessageResource(MessageType.INFO, "Person address updated");
		
		// When
    	String request = getJson(personAddressResource, true);
		String response = getJson(responseResource, false);
    	
		
    	// Then
		mockMvc.perform(put("/persons/{persinId}/addresses/{addressId}", personId, id)
				.contentType(MediaType.APPLICATION_JSON)
				.content(request))
				.andExpect(status().isOk())
				.andExpect(content().string(response));
		
		verify(facade).updateResource(id, personAddressResource);
	}
    
    @Test
	public void testDeletePersonAddress() throws Exception {
    	// Given
    	Long personId = 2L;
    	Long addressId = 1L;
    	
		// When

		// Then
    	mockMvc.perform(delete("/persons/{persinId}/addresses/{addressId}", personId, addressId))
    		.andExpect(status().is(204));
    	
    	verify(facade).removeResource(addressId);
	}
    
    @Test
	public void testGetAddress() throws Exception {
		// Given
    	Long personId = 1L;
    	Long id = 2L;
    	
    	PersonAddressResource personAddressResource = new PersonAddressResource();
    	personAddressResource.setId(id);
    	personAddressResource.setPersonId(personId);

		// When
		String response = getJson(personAddressResource, false);
		
		when(facade.getResource(anyLong())).thenReturn(personAddressResource);
		
		// Then
    	mockMvc.perform(get("/persons/{personId}/addresses/{addressId}", personId, id))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
    	verify(facade).getResource(id);
	}
    
    @Test
	public void testGetPersonPapers() throws Exception {
		// Given
    	Long id = 1L;
    	Long personId = 2L;
    	
    	PersonAddressResource personPaperResource = new PersonAddressResource();
    	personPaperResource.setId(id);
    	personPaperResource.setPersonId(personId);

    	long count = 100;
    	int limit = 25;
    	Integer offset = 10;
    	String uri = MessageFormat.format("/persons/{0}/addresses", personId);
		List<PersonAddressResource> entities = Arrays.asList(personPaperResource);
    	PagedResultResource<PersonAddressResource> expectedResource = new PagedResultResource<>();
		expectedResource.setCount(count);
		expectedResource.setLimit(limit);
		expectedResource.setOffset(offset);
		expectedResource.setUri(uri);
		expectedResource.setResources(entities);
		
		PersonAddressResource resource = new PersonAddressResource();
		resource.setPersonId(personId);
		PagedRequest<PersonAddressResource> pagedRequest = new PagedRequest<PersonAddressResource>(resource, offset, limit, Collections.<OrderBy>emptyList());
		
		// When
		when(facade.getResources(Matchers.<PagedRequest<PersonAddressResource>>any())).thenReturn(expectedResource);
    	String response = getJson(expectedResource, false);

		// Then
    	mockMvc.perform(get("/persons/{personId}/addresses", personId)
    			.param("offset", String.valueOf(offset))
    			.param("limit", String.valueOf(limit)))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
		verify(facade).getResources(pagedRequest);
	}

	@Test(expected = AccessDeniedException.class)
	public void testGetResourceWithAccessDeniedException() throws Exception {
		// Given
		Long id = 1L;
		Long personId = 2L;
		
		// When
		doThrow(AccessDeniedException.class).when(facade).getResource(anyLong());
		
		// Then
		mockMvc.perform(get("/persons/{personId}/addresses/{id}", personId, id));
		
		verify(facade).getResource(id);
	}
}
