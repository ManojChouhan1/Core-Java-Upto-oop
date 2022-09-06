package com.rays.datee;

public class GradingPractice {
public static void main(String[] args) {
	int mark=71;
	if(mark>32 && mark<=40) {
		System.out.println("grD:- D");
	}
	else if(mark>40 && mark<=50) {
		System.out.println("grD:- C");
	}
	else if(mark>50 && mark<=60) {
		System.out.println("grD:- C++");
	}else if(mark>60 && mark<=70) {
		System.out.println("grD:- B");
	}else if(mark>70 && mark<=80) {
		System.out.println("grD:- B++");
	}else if(mark>80 && mark<=90) {
		System.out.println("grD:- A");
	}else if(mark>90 && mark<=100) {
		System.out.println("grD:- A++");
	}
}
}
