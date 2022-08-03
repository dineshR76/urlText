package com.example.manage;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.manage.Model.CategoryKeyword;
@SpringBootApplication
public class UrlDecodeApplication implements CommandLineRunner {
	public static void main(String[] args)   {
		 
		SpringApplication.run(UrlDecodeApplication.class, args);
	}
		
		

	@Override
	public void run(String... args) throws Exception {

		//adding data to the hashmap category     
		     ArrayList<String> keywords = new ArrayList<>();
		 	keywords.add("star war");
		 	keywords.add("starwars");
		 	keywords.add("star war");
		 	keywords.add("r2d2");
		 	keywords.add("may the force be with you");
		 	
		 	
		 	ArrayList<String> keywords2 = new ArrayList<>();
			keywords2 .add("basketball");
			keywords2 .add("nba");
			keywords2 .add("lebron james");
			keywords2 .add("ncaa");
			keywords2 .add("john stokton");
			keywords2 .add("anthony davis");

			CategoryKeyword.add("Basketball", keywords2 );
		    CategoryKeyword.add("Star Wars", keywords);
		
	}
}
			

		
		
		
		
		
