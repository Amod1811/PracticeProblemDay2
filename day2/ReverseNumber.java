package com.bridgelabz.day2;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num = sc.nextInt();
		int rem, rev=0;
		
		while (num != 0)//check number not equal zero
		{
			rem = num%10;//number modules by ten 
			rev = rev * 10 + rem;// rev multiply by 10 and add the modules reminder
			num = num /10; ///num divide by 10
		
		System.out.println(rev);
		}

	}

}
