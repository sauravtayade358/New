package org.srt;

import java.util.Scanner;

public class SI {
	public void SimpleI()
	{
		Double P;
		Double N;
		Double R;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Principle::");
	    P=sc.nextDouble();
	    
	    System.out.println("Enter a Year::");
	    N=sc.nextDouble();
	    
	    System.out.println("Enter a Interest::");
	    R=sc.nextDouble();
	    
	    double si=(P*N*R)/100;
	    System.out.println("SI::"+si);
	    
	    
		
	}

	public static void main(String[] args) {
		
		SI i=new SI();
		i.SimpleI();
		
		
	}

}
