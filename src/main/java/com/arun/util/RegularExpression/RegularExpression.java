/**
 * 
 */
package com.arun.util.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Adwiti
 *
 */
public class RegularExpression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Pattern p = Pattern.compile(".s");
		Matcher m = p.matcher("as");
		
		System.out.println(m.matches()); //returns true
	}

}
