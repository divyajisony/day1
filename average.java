package day1;

import java.util.Scanner;

public class average {

	public static void main(String[] args) {
		double res=0;

		System.out.print("enter size:");
	Scanner sc=new Scanner(System.in);
int n=  sc.nextInt();
	int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
for(int i=0;i<n;i++) 
	//double res=0;
	res=res+a[i];
	System.out.println(res/n);
  
	}

}
