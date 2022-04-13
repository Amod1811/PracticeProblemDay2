package com.bridgelabz.day2;

import java.util.Scanner;

public class SunOFNaturalNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		int a= 1;
		int sum =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		number = sc.nextInt();
		 while (a<=number)// check number  value greater and equal
		 {
			 sum = sum + a; //sum with a
			 a++; // a is increment
		 }
       System.out.println("The number of from to "+number+ "=" + sum);
	}

}
