package q615;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Name1 = sc.next();
		int K_Score1 = sc.nextInt();
		int E_Score1 = sc.nextInt();
		
		sc.nextLine();
		
		String Name2 = sc.next();
		int K_Score2 = sc.nextInt();
		int E_Score2 = sc.nextInt();
		
		//sc.close();
		
		int K_avg = (K_Score1 + K_Score2) / 2;
		int E_avg = (E_Score1 + E_Score2) / 2;
		System.out.println(Name1 + " " + K_Score1 + " " + E_Score1);
		System.out.println(Name2 + " " + K_Score2 + " " + E_Score2);
		System.out.println("avg " + K_avg + " " + E_avg);
		
		
	}

}

