package BeginnerBook;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int reverseNumber = 0;
		while (num != 0) {
			reverseNumber = reverseNumber * 10;
			reverseNumber = reverseNumber + num%10;
			num = num/10;
		}
		
		System.out.println("Reverse number " + reverseNumber);
	}

}
