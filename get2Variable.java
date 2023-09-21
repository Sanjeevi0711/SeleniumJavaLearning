package guviTask8;

import java.util.Scanner;

public class get2Variable {
public static void main(String[] args) {
	int a,b,c,d;
	
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the value of a : ");
	a=sc.nextInt();
	System.out.println("Enter the value of b : ");
	b=sc.nextInt();
	System.out.println("Enter the value of c : ");
	c=sc.nextInt();
	System.out.println("Enter the value of d : ");
	d=sc.nextInt();
	if (a+b > c+d) {
		System.out.println("The sum of a and b is greater than the sum of c and d");
		
	}
	else {
		
}

	System.out.println("The sum of and b is not greater than the sum of c and d");
}

}

