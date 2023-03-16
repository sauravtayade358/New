package org.srt;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int no;
		no=sc.nextInt();
		
		if (no%2==0)
			System.out.println("no is even"+no);
		else
			System.out.println("odd"+no);
		

	}

}
