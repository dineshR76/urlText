package com.example.manage.main;

public class UrlText 
{
	public static void main(String[] args)
    {
String input = "https://www.radiosport.co.nz/sport-news/rugby/accident-or-one-last-dig-eddie-jones-re veals-hansens-next-job/";
String[] parts = input.split("[\\W]");

     for(String x:parts)
      {
          System.out.println( x);
      }
    }
}
