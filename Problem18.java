/**
 * @author Zoe Schmidt
 * CS 2420 - Spring 2019
 * Problem 18 from Chapter 3
 */
import java.util.Scanner;

public class Problem18 {

	//Variables for the combo lock
	private int num1;
	private int num2;
	private int num3;
	
	//Constructor that takes ints and puts them as the combo lock
	public Problem18(int a, int b, int c) {
		num1 = a;
		num2 = b;
		num3 = c;
	}
	
	//See's if the numbers provided are the correct numbers and if so open the lock
	public boolean open(int a, int b, int c) {
		
		return ((a == num1) && (b == num2) && (c == num3));
	}
	
	//Take the first three ints and see if they open the lock and if they do change the combo to the last three ints
	public boolean changeCombo(int a, int b, int c, int nA, int nB, int nC) {
		
		if(open(a, b, c)) {
			num1 = nA;
			num2 = nB;
			num3 = nC;
			return true;
		}
		return false;
		
	}
	
	public static void main(String[] args) {
	
		//Sets the combination
		Problem18 CL = new Problem18(3, 5, 6);
		
		Scanner in = new Scanner(System.in);
		int a;
		int b;
		int c;
		int a2;
		int b2;
		int c2;
		boolean o = true;
		
		while(o == true) {
			System.out.println("Enter three numbers to unlock");
			
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
			
			System.out.println("If that's right, enter three numbers to change the lock to");
			
			a2 = in.nextInt();
			b2 = in.nextInt();
			c2 = in.nextInt();
			
			if(CL.changeCombo(a, b, c, a2, b2 , c2)) {
				System.out.println("The combination is changed");
				o = false;

			}
			else {
				System.out.println("Combination is wrong");
				
			}
			
		}

	}

}
