package com.concretepage.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.UriComponentsBuilder;

import com.concretepage.domain.Article;
import com.concretepage.domain.Store;
import com.concretepage.service.IArticleService;
import com.concretepage.service.IStoreService;

@Controller
@RequestMapping("store")
public class MagasinController {
	@Autowired
	private IStoreService storeService;
	

	@GetMapping("stores")
	public ResponseEntity<List<Store>> getAllStores() {
		List<Store> list = storeService.getAllStores();
		return new ResponseEntity<List<Store>>(list, HttpStatus.OK);
	}
	
} 