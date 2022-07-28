package com.example.manage.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.example.manage.Model.CategoryKeyword;
public class Main2 
{
	
	 
	 
   public static void main(String args[]) throws IOException 
   {
	   String page = "https://edition.cnn.com/sport";
	      //Connecting to the web page
	      Connection conn = Jsoup.connect(page);
	      //executing the get request
	      Document doc = conn.get();
	      //Retrieving the contents (body) of the web page
	      String result = doc.body().text();
	      
	      String[] parts = result.split("[\\W]");
	      
	      ArrayList<String> list= new ArrayList<String>();
	      
	      for(String x:parts)
	       {
	    	 
	           list.add(x);
	       }
	      
	      //converting to lowercase
	      ArrayList<String> list1 = (ArrayList<String>) list.stream()
               .map(String::toLowerCase)
               .collect(Collectors.toList());   
	      
	      System.out.println(list1);
	      
	 //creating object for modelclass     
     CategoryKeyword ck = new CategoryKeyword();
     
     
//adding data to the hashmap category     
     ArrayList<String> keywords = new ArrayList<String>();
 	keywords.add("starwars");
 	keywords.add("star wars");
 	keywords.add("starwar");
 	keywords.add("r2d2");
 	keywords.add("star");
 	
 	ArrayList<String> keywords2 = new ArrayList<String>();
	keywords2 .add("basketball");
	keywords2 .add("nba");
	keywords2 .add("lebron james");
	keywords2 .add("ncaa");

	ck.add("Basketball", keywords2 );
    ck.add("starwars", keywords);
//   	ck.display();
   	
   
      
    //injecting the hashmap from model
    HashMap<String, ArrayList<String>> hm= ck.getMap();
    
    //comparing the list and map and priniting the matched value
    for(Map.Entry<String, ArrayList<String>> entry : hm.entrySet()) {
    	  for (String value : entry.getValue())
    		  if(list1.contains(value)) {
    			  System.out.println("the given url has a keyword as: "+ value); 
    			  System.out.println(" its category is: "+ entry.getKey());}
    	  {
    	  }
    	}
    
//    ArrayList<String> keyvalue = (ArrayList<String>) hm.entrySet().stream()
//   	    .filter(entry -> list1.contains(entry.getValue()))
//    	    .map(entry -> entry.getKey())
//    	    .collect(Collectors.toList());
//    
//    System.out.println(keyvalue);
//    
//    System.out.println(hm.get("starwars"));
// 
      
      	
      }
      
      
   }