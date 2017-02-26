package com.arun.comparatorExplained;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ComparingDateAndSorting {

	public static void main(String[] args) {
		
		SDOB s1 = new SDOB("Kishore",ComparingDateAndSorting.converttoDate("02-02-1998"));
		SDOB s2 = new SDOB("Rafi", ComparingDateAndSorting.converttoDate("02-01-1996"));
		SDOB s3 = new SDOB("Lata", ComparingDateAndSorting.converttoDate("01-03-1978"));
		
		List<SDOB> lstSDOB = new ArrayList<>();
		lstSDOB.add(s1);
		lstSDOB.add(s2);
		lstSDOB.add(s3);
		
		System.out.println(lstSDOB);
		Collections.sort(lstSDOB);
		System.out.println(lstSDOB);

	}

	public static Date converttoDate(String date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
		Date dateFormated = null;
		try {
			dateFormated = sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return dateFormated;
	}

}

class SDOB implements Comparable<SDOB>{
	private String name;
	private Date dob;

	public SDOB(String name, Date dob) {
		super();
		this.name = name;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public Date getDob() {
		return dob;
	}

	@Override
	public String toString() {
		return "SDOB [name=" + name + ", dob=" + dob + "]";
	}

	@Override
	public int compareTo(SDOB o) {
		return this.dob.compareTo(o.dob);
	}

}
