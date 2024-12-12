package Day_2;

import java.util.Scanner;

public class areaOfTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the base");
		float base = sc.nextFloat();
		System.out.println("enter the height");
		float height = sc.nextFloat();
		
		double area = 0.5 * (base * height);
		System.out.println("Area of traingle is : "+area);
	}

}
