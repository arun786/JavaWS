package com.arun.serializations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializingConcept {

	public static void main(String[] args) {
		//Serializing an object
		
		Cricketer c1 = new Cricketer();
		c1.setName("Sachin");
		c1.setCountry("India");
		c1.setScore(1000.00);
		c1.setNomatches(10.0);
		c1.setAverage(100.00);
		
		
		try {
			FileOutputStream fos = new FileOutputStream(new File("abc.ser"));
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(c1);
			oos.close();
			System.out.println("Object Serialized");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
