package com.rays.classs.basic;

public class D7Ag24ArgsIfelse {
	
	public static void main(String[] args) {
		int size=args.length;
		if(size==0) {
			System.out.println("No parameter");
		}
		else {
			for(int i=0; i<args.length;i++) {
			System.out.println(args[i]);
		}
	}
  }
}
