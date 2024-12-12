package Day_2;

import java.util.Scanner;

public class circumferenceOfCircle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the radius of circle");
		
		float r = sc.nextFloat();
		float pi = 22/7;
		
		float area = 2 * pi * r;
		System.out.println("Circumference of circle is: "+area);
	}

}
