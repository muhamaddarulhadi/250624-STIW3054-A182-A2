package com.hadi.a2;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task2 implements Runnable
{

	String lines;

    public task2(String lines)
    {
        this.lines = lines;
    }

    @Override
    public void run()
    {	
        String date = " ";
        Pattern findNoOfDays = Pattern.compile("\\d{1,2}/\\d{1,2}/\\d{4}");
        Matcher totalDays = findNoOfDays.matcher(lines);
        
        while (totalDays.find()) 
        {
        	date += " " + totalDays.group();
        }
        
        String date1[] = date.split(" ");
        date1 = Arrays.stream(date1).distinct().toArray(size -> new String[size]);
        int total = date1.length-1; 
        System.out.println("Total number of days   : " +total);
    }
}
