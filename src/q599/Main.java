package q599;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String A = sc.nextLine();
		sc.close();
		
		StringBuilder result = new StringBuilder();

		for (char ch : A.toCharArray()) {
		    if (Character.isLetter(ch)) {
		        result.append(ch);
		    }
		}
		System.out.print(result.toString().toUpperCase());
	}

}
