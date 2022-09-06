package com.rays.stringQue;

public class Q2ExtractLAstname {

	public static void main(String[] args) {
		
		String name = "vijay Dinanath Chouhan";
		
		String[] sb = name.split(" ");
		
		for(String str : sb) {
			
//			System.out.println(str);
			
		for (int i =str.length()-1; i >= 0; i--) {
			
			System.out.print(str.charAt(i));
		}
		System.out.print(" ");
	
		}
	}
}
