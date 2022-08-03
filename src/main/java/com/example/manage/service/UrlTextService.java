package com.example.manage.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.manage.Model.CategoryKeyword;

@Component
public class UrlTextService 
{
	
	@Autowired CategoryKeyword ck;
	
	public String find(String url) throws IOException
    {
        
	    Connection conn = Jsoup.connect(url);
		//executing the get request
		Document doc = conn.get();
		//Retrieving the contents (body) of the web page
		return doc.body().text();  
	
}
	public String categoryFinder(String url) throws IOException
	{
		
		
      HashMap<String, ArrayList<String>> hm= (HashMap<String, ArrayList<String>>) CategoryKeyword.getMap();
		 
		String result=find(url);															
		String val="";
		
		//comparing the list and map and printing the matched value
		for(Map.Entry<String, ArrayList<String>> entry : hm.entrySet()) 
		{
		  for (String value : entry.getValue())
		   if(result.toLowerCase().contains(value.toLowerCase())) 
		      {
		         val="The Given Url has the keyword "+value+
			     " so it belongs to "+entry.getKey()+" category";
		      }
		
		
	}
		return val;
}
}
