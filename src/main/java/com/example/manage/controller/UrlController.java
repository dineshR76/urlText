package com.example.manage.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.manage.service.UrlTextService;

import io.swagger.annotations.ApiOperation;

@Controller
public class UrlController 
{
 
 @Autowired UrlTextService urltext;
	
 @ApiOperation(value="Returns the URL,Category,Text of the Webpage")
 @GetMapping("/getcat")
 public String getCategory(@RequestParam("url") String url, Model m) throws IOException
 {
	 
	 String category = urltext.categoryFinder(url);
	 String text=urltext.find(url);
	 
	 m.addAttribute("category",category);
	 m.addAttribute("url", url);
	 m.addAttribute("text", text);
	 
	 
	 return "input2";
	 
 }
 
 @ApiOperation(value="Returns the Text and given URl of the Webpage")
 @GetMapping("/urltext")
 public String urltext(@RequestParam("url") String url, Model m) throws IOException
 {
	 String result= 
     urltext.find(url);
	 
	 m.addAttribute("result",result);
	 m.addAttribute("url", url);
	 
	 return "input1";
 }
 
 @ApiOperation(value="Returns the input URL form for part1")
 @GetMapping("/input1")
 public String input()
 {
	 return "input1";
 }
 
 @ApiOperation(value="Returns the input URL form for part2")
 @GetMapping("/input2")
 public String input2()
 {
	 return "input2";
 }
 
 
}
