package com.concretepage.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import com.concretepage.domain.Article;
import com.concretepage.domain.Store;
@Service
public class StoreService implements IStoreService {
	private List<Store> list = new ArrayList<>();
	{
		list.add(new Store(1, "Paris", "75000"));
		list.add(new Store(2, "Lille", "59000"));
		list.add(new Store(3, "Bordeaux", "50000"));
	}	
	@Override
	public List<Store> getAllStores(){
	    return list;
	}
}
