/**
 * 
 */
package RegularExpression;

import java.util.regex.Pattern;

/**
 * @author Adwiti
 *
 */
public class RegularExpression {

	public static void main(String[] args) {
		String content = "This is world of java..we are enjoying java";
		String pattern = ".*java*.";
		boolean isMatch = Pattern.matches(pattern, content);
		System.out.println(isMatch);
	}

}
