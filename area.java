package day1;

import java.util.Scanner;

public class area {
	public static void main(String[] args) {

	int side;
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a side value:");
	side=  sc.nextInt();
	int lenght,breath;
	System.out.print("enter a lenght value:");
	lenght=sc.nextInt();
	System.out.println("enter breadth value");
	breath=sc.nextInt();
	int area1=lenght*breath;
	//System.out.print(area1);
		float radius;
		System.out.println("enter the radius value");
		radius=sc.nextFloat();
		float area2=(22*radius*radius)/7;
		int area=side*side;
		System.out.println(area1);
		System.out.println(area);
		System.out.print(area2);
}
}