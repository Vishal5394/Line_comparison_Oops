package com.Bridgelabz.Emp;

import java.util.Scanner;

public class Line_Comparison_Opps {
	
	static int x1, x2, x3, x4, y1, y2, y3, y4 ;
	static double length_1,length_2;
	 
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
	         System.out.println("Enter co-ordinates of x3 and y3");
	         x3 = sc.nextInt();
	         y3 = sc.nextInt();
	         System.out.println("Enter co-ordinates of x4 and y4");
	         x4 = sc.nextInt();
	         y4 = sc.nextInt();
	       
	    }
        
	void Length() {
			length_1 = Math.sqrt((Math.pow(x2-x1, 2)) +(Math.pow (y2-y1, 2)));
			 System.out.println("Length of line 1 = " + length_1);
			  length_2 = Math.sqrt((Math.pow(x4-x3, 2)) +(Math.pow (y4-y3, 2)));
			 System.out.println("Length of line 2 = " + length_2);
	  
	}
	
	public void checkRelation() {
        if (length_1 == length_2) 
            System.out.println("Lines are equal");
         else if (length_1 > length_2) 
            System.out.println("line 1 is greater than line 2");
         else 
            System.out.println("Line 1 is less than line 2");
        }
public static void main(String[] args) {
	
	Line_Comparison_Opps obj = new Line_Comparison_Opps();
	obj.Welcome();
	obj.lengthValue();
	obj.Length();
	obj.checkRelation();
}
}
