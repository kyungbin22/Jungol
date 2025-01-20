package q529;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Height = sc.nextInt();
		int Weight = sc.nextInt();
		sc.close();
		
		int BMI = Weight+100-Height;
		
		System.out.println(BMI);
		if(BMI > 0) {
			System.out.println("Obesity");
		}
	}

}
