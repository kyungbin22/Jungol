package q596;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		int B = sc.nextInt();
		sc.close();
		
		int stringLength = A.length();
		if(B > stringLength) {
			B = stringLength;
		}
		String subString = A.substring(stringLength - B);
		String reversedString = new StringBuilder(subString).reverse().toString();

		System.out.println(reversedString);
	}

}
