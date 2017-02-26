package com.arun.comparatorExplained;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JukeBoxObjectSort {

	List<Songs> lstSong = new ArrayList<>();

	public static void main(String[] args) {
		JukeBoxObjectSort jbs = new JukeBoxObjectSort();
		jbs.ReadAFile();
		System.out.println(jbs.lstSong);
		Collections.sort(jbs.lstSong);
		System.out.println(jbs.lstSong);
	}

	public void ReadAFile() {
		ClassLoader loader = JukeBoxNormalStringSort.class.getClassLoader();
		File file = new File(loader.getResource("JukeBoxWithMoreDetails.txt").getFile());
		BufferedReader br = null;
		try {
			FileReader reader = new FileReader(file);
			br = new BufferedReader(reader);
			String line = null;
			while ((line = br.readLine()) != null) {
				String str[] = line.split(",");
				Songs song = new Songs(str[0], str[1], str[2], str[3]);
				lstSong.add(song);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
