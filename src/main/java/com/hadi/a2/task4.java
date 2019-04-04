package com.hadi.a2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task4 implements Runnable
{
	String lines;

    public task4(String lines)
    {
        this.lines = lines;
    }
	
    @Override
	public void run() 
	{ 
        Pattern course = Pattern.compile("ST[IQ][ADJKNWMS]\\d");
        Matcher SOCcourse = course.matcher(lines);
       
        int total = 0;
        while (SOCcourse.find()) 
        {
        	total++;
        }
        
        System.out.println("Total SOC course       : " +total);
	}
}
