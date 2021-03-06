package com.bitcook.yeboa.app.services;

import static org.mockito.Mockito.*;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.bitcook.yeboa.app.dao.impl.PatientDAOImpl;
import com.bitcook.yeboa.app.errorhandling.AppException;
import com.bitcook.yeboa.app.models.Patient;

@RunWith(MockitoJUnitRunner.class)
public class PatientServiceDbAccessImplTest {

	private static final Long CREATED_PATIENTS_RESOURCE_ID = Long.valueOf(1);
	private static final String SOME_PATIENT_USERNAME = "some_user_name";
	private static final String SOME_TITLE = "some title";
	private static final String EXISTING_FEED = "http://quarks.de/feed";
	private static final Long SOME_ID = 13L;
	
	@Rule
	public ExpectedException exception = ExpectedException.none();	

	PatientServiceImpl sut;//system under test
	
	@Mock
	PatientDAOImpl patientDao;
	
	
	@Before
	public void setUp() throws Exception {		
		sut = new PatientServiceImpl();
		sut.setPatientDao(patientDao);
	}

/*	@Test
	public void testCreatePodcast_successful() throws AppException {
		
		when(podcastDao.getPodcastByFeed(SOME_PATIENT_USERNAME)).thenReturn(null);		
		when(podcastDao.createPodcast(any(PodcastEntity.class))).thenReturn(CREATED_PATIENTS_RESOURCE_ID);
		when(patientDao.save(any(Patient.class)).getId()).thenReturn(CREATED_PATIENTS_RESOURCE_ID);
		Podcast podcast = new Podcast();
		podcast.setFeed(SOME_PATIENT_USERNAME);
		podcast.setTitle(SOME_TITLE);
		Long createPodcast = sut.createPodcast(podcast);
		
		verify(podcastDao).getPodcastByFeed(SOME_PATIENT_USERNAME);//verifies if the method podcastDao.getPodcastByFeed has been called exactly once with that exact input parameter
		verify(podcastDao, times(1)).getPodcastByFeed(SOME_PATIENT_USERNAME);//same as above
		verify(podcastDao, times(1)).getPodcastByFeed(eq(SOME_PATIENT_USERNAME));//same as above
		verify(podcastDao, times(1)).getPodcastByFeed(anyString());//verifies if the method podcastDao.getPodcastByFeed has been called exactly once with any string as input
		verify(podcastDao, atLeastOnce()).getPodcastByFeed(SOME_PATIENT_USERNAME);//verifies if the method podcastDao.getPodcastByFeed has been called at least once with that exact input parameter		
		verify(podcastDao, atLeast(1)).getPodcastByFeed(SOME_PATIENT_USERNAME);//verifies if the method podcastDao.getPodcastByFeed has been called at least once with that exact input parameter
		verify(podcastDao, times(1)).createPodcast(any(PodcastEntity.class));
		verify(podcastDao, never()).getLegacyPodcastById(anyLong());//verifies the method podcastDao.getLegacyPodcastById has never been called
		
		Assert.assertTrue(createPodcast == CREATED_PATIENTS_RESOURCE_ID);
	}

	@Test(expected=AppException.class)	
	public void testCreatePodcast_error() throws AppException {
		
		PodcastEntity existingPodcast = new PodcastEntity();
		when(podcastDao.getPodcastByFeed(EXISTING_FEED)).thenReturn(existingPodcast);			
		
		Podcast podcast = new Podcast();
		podcast.setFeed(EXISTING_FEED);
		podcast.setTitle(SOME_TITLE);
		sut.createPodcast(podcast);

	}
	
	@Test	
	public void testCreatePodcast_validation_missingFeed() throws AppException {
		
		exception.expect(AppException.class);
		exception.expectMessage("Provided data not sufficient for insertion");
						
		sut.createPodcast(new Podcast());

	}		
	
	@Test	
	public void testCreatePodcast_validation_missingTitle() throws AppException {
		
		exception.expect(AppException.class);
		exception.expectMessage("Provided data not sufficient for insertion");
						
		Podcast podcast = new Podcast();
		podcast.setFeed(EXISTING_FEED);
		sut.createPodcast(podcast);

	}	
	

	@Test
	public void testUpdatePartiallyPodcast_successful() throws AppException {
		
		PodcastEntity podcastEntity = new PodcastEntity();
		podcastEntity.setId(SOME_ID);
		when(podcastDao.getPodcastById(SOME_ID)).thenReturn(podcastEntity);		
		doNothing().when(podcastDao).updatePodcast(any(PodcastEntity.class));
		
		Podcast podcast = new Podcast(podcastEntity);
		podcast.setFeed(SOME_PATIENT_USERNAME);
		podcast.setTitle(SOME_TITLE);
		sut.updatePartiallyPodcast(podcast);
		
		verify(podcastDao).getPodcastById(SOME_ID);//verifies if the method podcastDao.getPodcastById has been called exactly once with that exact input parameter
		verify(podcastDao).updatePodcast(any(PodcastEntity.class));		
		
		Assert.assertTrue(podcast.getFeed() == SOME_PATIENT_USERNAME);
		Assert.assertTrue(podcast.getTitle() == SOME_TITLE);
	}
	
	@Test
	public void testUpdatePartiallyPodcast_not_existing_podcast() {
		
		when(podcastDao.getPodcastById(SOME_ID)).thenReturn(null);
		
		Podcast podcast = new Podcast();
		podcast.setId(SOME_ID);
		try {
			sut.updatePartiallyPodcast(podcast);
			Assert.fail("Should have thrown an exception"); 
		} catch (AppException e) {
			verify(podcastDao).getPodcastById(SOME_ID);//verifies if the method podcastDao.getPodcastById has been called exactly once with that exact input parameter
			Assert.assertEquals(e.getCode(), 404);
		}
		
	}*/	
	
}
