package q519;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
		
		
		System.out.print(num1 + 100 + " ");
		System.out.print(num2 % 10);
	}

}
