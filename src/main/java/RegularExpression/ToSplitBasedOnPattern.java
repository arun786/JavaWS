/**
 * 
 */
package RegularExpression;

import java.util.regex.Pattern;

/**
 * @author Adwiti
 *
 */
public class ToSplitBasedOnPattern {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("is",Pattern.CASE_INSENSITIVE);
		String texts = "ThisisArungoingtoLAisasoftwareistoday";
		String [] text = pattern.split(texts);
		for(String t : text){
			System.out.println(t);
		}
	}

}
