package com.hadi.a2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class Main 
{
	public static void main(String[] args)
	{
		//get data from pdf
		try
		{
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Pdf data reader");
			System.out.println("---------------\n");
			System.out.print("Enter path of your A182 Draft stud pdf file : ");
			String filename = scan.nextLine();
			System.out.println("\n");
			File inputFile = new File(filename);
			PDDocument document = PDDocument.load(inputFile);
			//PDDocument document = PDDocument.load(new File("C:\\Users\\robber_hadi\\Desktop\\UUM STUDY\\SEM 5\\STIW3054 KUMP A REAL-TIME PROGRAMMING\\ASSIGNMENT 2\\A182 Draft Stud.pdf"));
			document.getClass();
			
			if (!document.isEncrypted())
			{
				PDFTextStripper getData = new PDFTextStripper();
				String lines = getData.getText(document);

		
				//start task 1
				try
				{
					task1 t1 = new task1(lines);
					Thread ta1 = new Thread(t1);
					ta1.start();
					Thread.sleep(2000);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
				
				
				//start task 2
				try
				{
					task2 t2 = new task2(lines);
					Thread ta2 = new Thread(t2);
					ta2.start();
					Thread.sleep(2000);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
				
				
				//start task 4
				try
				{
					task4 t4 = new task4(lines);
					Thread ta4 = new Thread(t4);
					ta4.start();
					Thread.sleep(2000);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
				
				
				//start task 3
				try
				{
					task3 t3 = new task3(lines);
					Thread ta3 = new Thread(t3);
					ta3.start();
					Thread.sleep(2000);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
				
				//start task 5
				try
				{
					task5 t5 = new task5(lines);
					Thread ta5 = new Thread(t5);
					ta5.start();
					Thread.sleep(2000);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}

			}
			else
			{
				System.out.print("The pdf file cannot be read!");
			}
			
			document.close();
			
		}
		catch (FileNotFoundException e)
		{
			System.out.println("\nPlease enter valid path of your A182 Draft stud pdf file!");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}