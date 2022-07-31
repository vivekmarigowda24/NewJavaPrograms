package com.programs;

public class AmStrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Amstrong = 2348,n=0,result=0,digit;
		
		while(Amstrong/10>0) {
			n++;
			Amstrong=Amstrong%10;
		}
		
		while(Amstrong/10>0) {
			digit = Amstrong%10;
			result+=Math.pow(digit, n);
			Amstrong=Amstrong/10;
			
		
		}
		if(result==Amstrong)
			System.out.println("Number is amstrong");
		else 
			System.out.println("Number is not amstrong");

	}

}
