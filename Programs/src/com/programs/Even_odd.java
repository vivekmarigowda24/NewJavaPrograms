package com.programs;

import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int value = sc.nextInt();
		
		if (value/2==0)
			System.out.println("even");
		else
			System.out.println("odd");
	}

}
