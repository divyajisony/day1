package day1;

import java.util.Scanner;

public class productanddivision {

	public static void main(String[] args) {
		int x,y,pro=0,div=0,div1;
		Scanner sc=new Scanner(System.in);
		System.out.print("First input:");
		x=sc.nextInt();
		System.out.print("second input:");
		y=sc.nextInt();
		pro=x*y;
		div=x/y;
		div1=x%y;
		System.out.println(pro);
		System.out.println(div);
		System.out.println(div1);

	}

}
