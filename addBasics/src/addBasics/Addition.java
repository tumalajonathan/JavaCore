//Addition of 2 int

package addBasics;
import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int number1; //first number
		int number2; //second number
		
		int sum; //sum of first and second number
		
		System.out.print("First number: ");
		number1 = input.nextInt();
		
		System.out.print("Second number: ");
		number2 = input.nextInt();
		
		sum = number1 + number2;
		
		System.out.printf("The sum is %d",sum);

	}

}
