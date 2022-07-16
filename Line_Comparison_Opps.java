package com.Bridgelabz.Emp;

import java.util.Scanner;

public class Line_Comparison_Opps {
	
	static int x1, x2, y1,y2;
	 
	    void Welcome () {
			System.out.println("Welcome to Line Comparison Computation");
		}
	    public void lengthValue() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("For given line");
	        System.out.println("Enter co-ordinates of x1 and y1");
	         x1 = sc.nextInt();
	         y1 = sc.nextInt();
	        System.out.println("Enter co-ordinates of x2 and y2");
	         x2 = sc.nextInt();
	         y2 = sc.nextInt();
	       
	    }
        
	void Length() {
			double length = Math.sqrt((Math.pow(x2-x1, 2)) +(Math.pow (y2-y1, 2)));
			 System.out.println("Length of line = " + length );
			
	  
	}
public static void main(String[] args) {
	
	Line_Comparison_Opps obj = new Line_Comparison_Opps();
	obj.Welcome();
	obj.lengthValue();
	obj.Length();
}
}
