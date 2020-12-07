package com.cdac.comp;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MyColl {
	private List<String> myList;
	private Set<String> mySet;
	private Map<String, Object> myMap;
	private Properties myProperties;
	private String[] myArr;
	public MyColl() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public MyColl(List<String> myList, Set<String> mySet, Map<String, Object> myMap, Properties myProperties,
			String[] myArr) {
		System.out.println("param===========");
		this.myList = myList;
		this.mySet = mySet;
		this.myMap = myMap;
		this.myProperties = myProperties;
		this.myArr = myArr;
	}




	public List<String> getMyList() {
		return myList;
	}
	
	public Set<String> getMySet() {
		return mySet;
	}
	
	public Map<String, Object> getMyMap() {
		return myMap;
	}
	
	public Properties getMyProperties() {
		return myProperties;
	}
	
	public String[] getMyArr() {
		return myArr;
	}
	
	
	
	
}
