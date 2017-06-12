/**
 * 
 */
package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Adwiti
 *
 */
public class CaseInsensitiveRegularExpression {
	
	public static void main(String[] args) {
		String content = "this is JAVA..this is JaVa";
		String patternString =".*java*.";
		Pattern pattern = Pattern.compile(patternString,Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(content);
		boolean isMatch = matcher.matches();
		System.out.println(isMatch);
	}

}
