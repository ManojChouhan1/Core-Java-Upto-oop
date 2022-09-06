package com.rays.classs.basic;

public class D6Ag22StringBufferMethod {
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Vijay");
		sb.append("Dinanath Chouhan");
		
		System.out.println(sb);
	    System.out.println("sb.length(): "+sb.length());
	    System.out.println("sb.capacity(): "+sb.capacity());
	    System.out.println("sb,charAt(1): "+sb.charAt(1));
	    System.out.println("sb.indexOf: "+sb.indexOf("Dinanath"));
	    System.out.println("sb.replaceOf: "+sb.replace(0, 5, "manoj"));
	    {	    System.out.println("sb.reverse: "+sb.reverse());}
	}

}
