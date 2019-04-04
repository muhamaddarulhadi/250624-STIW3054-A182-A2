package com.hadi.a2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task5 implements Runnable
{
	String lines;

    public task5(String lines)
    {
        this.lines = lines;
    }
	
    @Override
	public void run() 
	{
		String rp = " "; 
        Pattern course = Pattern.compile("\\d.*STIW3054\\s.*\\w");
        Matcher realtime = course.matcher(lines);

        while (realtime.find()) 
        {
         	rp += "\n" +realtime.group();
	    }
        
        System.out.println("~~ Info about STIW3054 ~~"+rp);
	}
}
