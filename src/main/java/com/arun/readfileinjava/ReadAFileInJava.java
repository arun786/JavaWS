package com.arun.readfileinjava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadAFileInJava {
	public static void main(String[] args) {
		
		ClassLoader loader = ReadAFileInJava.class.getClassLoader();
		
		File file = new File(loader.getResource("abc.txt").getFile());
		FileReader reader = null;

		// Use FileReader
		System.out.println("--------------------------");
		System.out.println("Reading using a file Input stream which reads byte by byte");
		System.out.println("--------------------------");

		try {
			reader = new FileReader(file);
			int character = reader.read();
			while (character != -1) {
				System.out.print((char)character);
				character = reader.read();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("Reading using a file reader which reads character by character");
		System.out.println("--------------------------");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			int data = fis.read();
			while(data != -1){
				System.out.print((char)data);
				data = fis.read();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("Reading using a buffered reader, which reads the whole line");
		System.out.println("--------------------------");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
			String line;
			while((line = br.readLine()) != null){
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("Reading using a scanner, which reads line");
		System.out.println("--------------------------");
		
		try {
			Scanner scan = new Scanner(file);
			while(scan.hasNextLine()){
				System.out.println(scan.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
