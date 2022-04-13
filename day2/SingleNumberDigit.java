package com.bridgelabz.day2;

import java.util.Scanner;


public class SingleNumberDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		String[] array = {"zero","one","Two","Three","Four","Five","Six","Seven","Eight","nine"};
		// Array Number
		Scanner sc = new Scanner(System.in);// Create object
		System.out.println("Enter the SingleDigit Number :");// take user input
		a = sc.nextInt();// use method for user input
		if(a<10) { // 
			System.out.println("You have entered number : " + array[a]);//print the Array
			a= sc.nextInt();
		
		System.out.println("program :" + array[a]);
		System.exit(0);
		
	}
	else {
		System.out.println("not allow");
		System.exit(0);
	}
	}
}
