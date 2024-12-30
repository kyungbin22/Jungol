package P;

import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        System.out.println(N);
        if(N < 0) {
            System.out.println("minus");
        }
    }
}