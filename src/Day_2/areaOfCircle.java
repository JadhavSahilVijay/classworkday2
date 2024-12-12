package Day_2;

import java.util.Scanner;

public class areaOfCircle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the radius of circle");
		
		float r = sc.nextFloat();
		float pi = 22/7;
		
		float area = pi * r * r;
		System.out.println("Area of circle is: "+area);
	}

}
