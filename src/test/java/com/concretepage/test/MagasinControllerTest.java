package com.concretepage.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import com.concretepage.domain.Store;
import com.concretepage.service.StoreService;

@RunWith(SpringRunner.class)
public class MagasinControllerTest {

	@TestConfiguration
	static class MagasinControllerImplTestContextConfiguration {

		@Bean
		public StoreService storeService() {
			return new StoreService();
		}
	}

	@Autowired
	private StoreService storeService;
	
	@Test
	public void testAllStores() {
		List<Store> listStore = storeService.getAllStores();
		assertTrue(listStore != null && listStore.size() > 0);
	}

}
