package com.bridgelabz.day2;

import java.util.Scanner;


public class Progam2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter the number :");
	    int n = sc .nextInt();
	    int a = n, b= n;
	    int x= a % 10;
	    int y= b/10;
	    
       String [] single_digit =new String [] {"one"};
       String [] two_digit =new String [] {"ten"};
       String [] tens_multiple =new String [] {"Hundred"};
       
       if (y==100) {
    	   System.out.println(two_digit[y+1]);
       }
       else if (x==10) {
    	   System.out.println(tens_multiple[x]);
       }
       else {
    	   System.out.println(tens_multiple [y]+ "-" + single_digit[x]);
       }
       
		}

	}


