package com.programs;

import java.util.Scanner;

import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		
		boolean flag=true;
		
		for(int i=0;i<s/2;s++) {
			
			if(s%i==0) {
				
				flag=false;
			}
		}
		if(flag)
			System.out.println("Odd number");
		else
			System.out.println("Even Number");
	}
	

}
