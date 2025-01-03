package q593;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		while(true) {
			System.out.print("ASCII code =? ");
			int N = sc.nextInt();
			
			if(N < 33 || N >127) {
				break;
			}
			
			char asciichar = (char) N;
			System.out.println(asciichar);
		}
		sc.close();
	}

}
