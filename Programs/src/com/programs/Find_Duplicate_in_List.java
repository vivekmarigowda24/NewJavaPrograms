package com.programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Find_Duplicate_in_List {

	private static HashSet<String> duplicateFind(List<String> listvalues) {
		
		HashSet<String> Duplicate = new HashSet<String>();
		
		HashSet<String> Result =  new HashSet<String>();
		
		for(String itr : listvalues ) {
			
			if(!Duplicate.add(itr)) {
				Result.add(itr);
			}
		}
		
		System.out.println("Duplicate values"+Duplicate);
		return Result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("dev");
		
		arr.add("raj");
		
		arr.add("name");
		
		arr.addAll(arr);

		System.out.println("After duplicate removal"+duplicateFind(arr));
	}

}
