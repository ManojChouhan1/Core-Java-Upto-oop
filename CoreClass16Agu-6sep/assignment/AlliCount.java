package com.rays.assignment;

public class AlliCount {
	public static void main(String[] args) {
		String name="Vijay Dinanath Chouhan";
	
		char c='i';
		int count=0;
		for(int i=0; i<name.length(); i++) {
			if(c==name.charAt(i)) {
				count++;
//				System.out.println(count+":- "+i);
				
			}
		}
		System.out.println(count);
	}
}
