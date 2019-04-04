package com.hadi.a2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task3 implements Runnable
{
	String lines;

    public task3(String lines)
    {
        this.lines = lines;
    }

    @Override
	public void run() 
	{
    	String allSOC = " ";
     
        Pattern course = Pattern.compile("ST[IQ][MSANDJKW]\\d.*\\w");
        Matcher SOCcourse = course.matcher(lines);
        
        while (SOCcourse.find()) 
        {
        	allSOC +="\n" + SOCcourse.group().trim();
        }
        
        System.out.println("\n~~ Course from SOC ~~ " +allSOC+"\n");
	}
}
