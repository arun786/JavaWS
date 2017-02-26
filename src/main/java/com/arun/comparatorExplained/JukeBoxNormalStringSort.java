/**
 * 
 */
package com.arun.comparatorExplained;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Adwiti
 *
 */
public class JukeBoxNormalStringSort {
	
	private List<String> lstOfSingers = new ArrayList<String>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JukeBoxNormalStringSort jb = new JukeBoxNormalStringSort();
		jb.ReadTheJukeBox();
		System.out.println(jb.lstOfSingers);
		Collections.sort(jb.lstOfSingers);
		System.out.println(jb.lstOfSingers);
	}
	
	public void ReadTheJukeBox(){
		
		ClassLoader loader = JukeBoxNormalStringSort.class.getClassLoader();
		
		
		File file = new File(loader.getResource("JukeBox.txt").getFile());
		try {
			FileReader reader = new FileReader(file);
			BufferedReader br = new BufferedReader(reader);
			String line = null;
			while((line = br.readLine())!=null){
				lstOfSingers.add(line);
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
