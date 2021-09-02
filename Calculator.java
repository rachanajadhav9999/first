package calci;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double number1,number2,result=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		number1=sc.nextDouble();
		number2=sc.nextDouble();
		char operator=sc.next().charAt(0);
		switch(operator)
		{
		case '+':
			result=2*number1+2*number2;
			break;
		case '-':
			result=2*number1-2*number2;
			break;
		default:
			System.out.println("You enter wrong input");
			break;
		}
		System.out.println("The final result:");
		  
        System.out.println();
        System.out.println(number1 + " " + operator + " " + number2
                + " = " + result);

	}

}