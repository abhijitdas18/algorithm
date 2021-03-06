package com.abhi.algorithm.sort;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingFileContents {

	public static void main(String[] args) {
		
		List<String> lines = new ArrayList<>();

		try {
			BufferedReader reader = new BufferedReader(new FileReader("D:\\CLONE_GIT\\MyProject\\algorithm\\src\\main\\java\\com\\abhi\\algorithm\\sort\\a.txt"));
			
			try {
				String currentLine = reader.readLine();
				
				while(currentLine != null)
				{
					System.out.println(currentLine);
					lines.add(currentLine);
					currentLine = reader.readLine();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//sort the lines
		System.out.println("Current line : "+ lines);
		Collections.sort(lines);
		System.out.println("Sort the lines : " + lines);
		
		// write inot a file
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\CLONE_GIT\\MyProject\\algorithm\\src\\main\\java\\com\\abhi\\algorithm\\sort\\b.txt"));
			for(String s : lines)
			{
				writer.write(s);
				writer.newLine();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
