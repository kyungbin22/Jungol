package jangol;

import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
    	
    	char[] characters = new char[10];	
    	
    	Scanner sc = new Scanner(System.in);
    	for (int i = 0; i < 10; i++) {
    		characters[i] = sc.next().charAt(0);
    	}
    	for (int i= 0; i < 10; i++) {
    		System.out.print(characters[i]);
    	}
    	sc.close();
    }
}