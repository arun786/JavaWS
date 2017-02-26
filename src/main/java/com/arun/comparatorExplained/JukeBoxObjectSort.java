package com.arun.comparatorExplained;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JukeBoxObjectSort {

	List<Songs> lstSong = new ArrayList<>();

	public static void main(String[] args) {
		JukeBoxObjectSort jbs = new JukeBoxObjectSort();
		jbs.ReadAFile();
		System.out.println(jbs.lstSong);
		Collections.sort(jbs.lstSong);
		System.out.println(jbs.lstSong);

		// Based on Rating
		Collections.sort(jbs.lstSong, jbs.new SongBasedOnRating());
		System.out.println(jbs.lstSong);
		
		//based on bpm
		Collections.sort(jbs.lstSong, jbs.new SongBasedOnBPM());
		System.out.println(jbs.lstSong);
	}

	class SongBasedOnRating implements Comparator<Songs> {

		@Override
		public int compare(Songs o1, Songs o2) {
			return o1.getRating().compareTo(o2.getRating());
		}
	}

	class SongBasedOnBPM implements Comparator<Songs> {
		@Override
		public int compare(Songs o1, Songs o2) {
			return o1.getBpm().compareTo(o2.getBpm());
		}
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
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}



/*O/p

[Songs [title=1, artist=kishore, rating=1, bpm=10], Songs [title=2, artist=Rafi, rating=2, bpm=11], Songs [title=3, artist=Lata, rating=5, bpm=1], Songs [title=4, artist=kk, rating=3, bpm=12]]
[Songs [title=3, artist=Lata, rating=5, bpm=1], Songs [title=2, artist=Rafi, rating=2, bpm=11], Songs [title=1, artist=kishore, rating=1, bpm=10], Songs [title=4, artist=kk, rating=3, bpm=12]]
[Songs [title=1, artist=kishore, rating=1, bpm=10], Songs [title=2, artist=Rafi, rating=2, bpm=11], Songs [title=4, artist=kk, rating=3, bpm=12], Songs [title=3, artist=Lata, rating=5, bpm=1]]
[Songs [title=3, artist=Lata, rating=5, bpm=1], Songs [title=1, artist=kishore, rating=1, bpm=10], Songs [title=2, artist=Rafi, rating=2, bpm=11], Songs [title=4, artist=kk, rating=3, bpm=12]]
*/