package com.hadi.a2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task1 implements Runnable
{
	String lines;
    int total = 0;

    public task1(String lines)
    {
        this.lines = lines;
    }

    @Override
    public void run()
    {		 
    	 Pattern findNoOfCourse = Pattern.compile("\\w\\d{4}");
    	 Matcher totalCourse = findNoOfCourse.matcher(lines);
    	 
	     while (totalCourse.find()) 
	     {
        	total++;
	     }
	     
	     System.out.println("Total number of course : " +total);
    }
}
