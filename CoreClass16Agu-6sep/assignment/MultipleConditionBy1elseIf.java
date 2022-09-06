package com.rays.assignment;

public class MultipleConditionBy1elseIf {
	public static void main(String[] args) {
		 int money =1002 ;
		 
		 if(money>100 && money<=200) {
			 System.out.println("I can buy pizza");
			 
		 }else if(money >200 && money <400) {
			 System.out.println("I can buy medium pizza");
		 }
		 else if(money>=400 && money<1000){
			 System.out.println("i can buy big pizza");
		 }else if(money>=1000) {
			 System.out.println("i can buy bada vala pizza.....");
			 
		 }
		 else{
			 System.out.println("i can't buy pizza");
		 }
	}

}
