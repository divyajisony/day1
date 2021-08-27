package day1;

import java.util.Scanner;

public class sumanddifference {
	public static void main(String[] args) {
	int x,y,sum=0,diff=0;
	Scanner sc=new Scanner(System.in);
	System.out.print("First input:");
	x= sc.nextInt();
	System.out.print("Second input:");
	y=sc.nextInt();
	sum=x+y;
	diff=x-y;
	System.out.println(sum);
	System.out.println(diff);	
	}

}
