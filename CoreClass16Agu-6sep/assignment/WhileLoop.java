package com.rays.assignment;

public class WhileLoop {
	public static void main(String[] args) {
		boolean JabTkHaiJaan= true;
		int round =0;
		while(JabTkHaiJaan) {
			System.out.println(round+" Basanti nachegi");
			round++;
			if(round>4)JabTkHaiJaan=false;
		}
	}

}
