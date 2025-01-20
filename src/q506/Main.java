package q506;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		double weight = sc.nextDouble();
		sc.close();
		
		info person = new info(height,weight);
		System.out.println(person.getheight());
		System.out.println(person.getweight());
	}
}


class info{
	public int height;
	public double weight;

	public info(int height, double weight) {
		this.height = height;
		this.weight = weight;
	}
	
	public int getheight() {
		return height;
	}
	
	public double getweight() {
		return weight;
	}
}
