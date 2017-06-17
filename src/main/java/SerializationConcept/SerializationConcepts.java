/**
 * 
 */
package SerializationConcept;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author Adwiti
 *
 */
public class SerializationConcepts {

	public static void main(String[] args) throws IOException {

		/*
		 * To write a Object to a file, we use ObjectOutputStream, here the
		 * concept of Decorator Pattern is being used, i.e. writing an object to
		 * a stream using file, fileoutputstream and then to Objectoutputstream
		 * used decorator pattern design patterns
		 */
		File file = new File("cricket.txt");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		/* Create Objects of Cricketer and write to a file */

		Cricketer crick1 = new Cricketer("1", "Sachin", 20000);
		Cricketer crick2 = new Cricketer("2", "Sourav", 15000);

		oos.writeObject(crick1);
		oos.writeObject(crick2);

		/* you need to flush to write the object */
		oos.flush();

		System.out.println("Objects has been written to file in stream format");
	}
}

class Cricketer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3188459919412303089L;
	private String id;
	private String name;
	private Integer score;

	/**
	 * @param id
	 * @param name
	 * @param score
	 */
	public Cricketer(String id, String name, Integer score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the score
	 */
	public Integer getScore() {
		return score;
	}

	/**
	 * @param score
	 *            the score to set
	 */
	public void setScore(Integer score) {
		this.score = score;
	}

}
