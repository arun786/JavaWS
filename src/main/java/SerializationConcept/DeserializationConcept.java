/**
 * 
 */
package SerializationConcept;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author Adwiti
 *
 */
public class DeserializationConcept {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/* To convert byte to Object, we use ObjectInputStream */
		File file = new File("cricket.txt");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Cricketer cricketers = null;
		while (true) {
			try {
				cricketers = (Cricketer) ois.readObject();
			} catch (EOFException e) {
				return;
			} finally {
				ois.close();
			}
			System.out.println(cricketers);
		}
	}
}

/*
 * o/p will be
 * 
 * Cricketer [id=1, name=Sachin, score=20000]
 * 
 * Cricketer [id=2, name=Sourav, score=15000]
 */
