package com.arun.serializations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserilizingConcept {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(new File("abc.ser"));
			ObjectInputStream ois = new ObjectInputStream(fis);
			Cricketer c1 = (Cricketer) ois.readObject();
			System.out.println(c1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	/*we will get the output as below*/
	/*Cricketer [name=Sachin, country=India, score=1000.0, nomatches=10.0, average=null]*/

}
