package project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		int i = sc.nextInt(); 
		
		String sub_str1 = s.substring(i-1, i);
		System.out.println(sub_str1);
		
		
	}

}
