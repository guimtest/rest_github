package com.concretepage.domain;

public class Store { 
    private int storeId;  
    private String title;
	private String category;
	public Store() {}	
	public Store(int storeId, String title, String category) {
		this.storeId = storeId;
		this.title = title;
		this.category = category;
	}
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
} 