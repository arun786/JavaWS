package com.arun.interviewquedtions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializingAnObject {

	public static void main(String[] args) {
		Stdents s1 = new Stdents();
		s1.setAge("10");
		s1.setName("Sachin");
		Stdents s2 = new Stdents();
		s2.setAge("15");
		s2.setName("Rahul");

		/* Write to an object to using ObjectOutputStream */

		File file = new File("serialized.doc");
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(s1);
			oos.writeObject(s2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

class Stdents implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 860543218397144027L;

	private String name;
	private String age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}
