package com.example.manage.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class CategoryKeyword 
{
	
	
	 static HashMap<String, ArrayList<String>> map = new HashMap<>();
	
	
	public static void add(String category, List<String> keyword)
	{
		map.put(category, (ArrayList<String>) keyword);
	}
	

	public static Map<String, ArrayList<String>> getMap() {
		return map;
	}
	
	public static void setMap(Map<String, ArrayList<String>> map) {
		CategoryKeyword.map = (HashMap<String, ArrayList<String>>) map;
	}
	
	private CategoryKeyword()
	{
		super();
	}

	
}
