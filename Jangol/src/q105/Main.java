package q105;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String[] cities = {
	            "Seoul", "Pusan", "Incheon", "Daegu", "Gwangju"
	        };
	        String[] populations = {
	            "10,312,545", "3,567,910", "2,758,296", "2,511,676", "1,454,636"
	        };
	        String[] changes = {
	            "+91,375", "+5,868", "+64,888", "+17,230", "+29,774"
	        };
	        
	        for (int i = 0; i < cities.length; i++) {
	            System.out.printf("%15s%15s%15s%n", cities[i], populations[i], changes[i]);
	        }
	}

}
