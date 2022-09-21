package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in); 
		System.out.println( "Hello to the Sieve!"); 


		System.out.print(" Enter number: ");
		int number = in.nextInt();

		boolean [] primeNumber = new boolean[number]; 

		for(int i= 0; i<number; i++) {
			primeNumber[i] = true;
		} 
		for (int p=2; p<number; p++) {

			if (primeNumber[p]) 
			{

				for ( int multiples=2*p; multiples<number; multiples+=p) {
					primeNumber[multiples]=false; 
				} 


			}
		}
		for(int i= 0; i<number; i++) {
			if (primeNumber[i]) 
			System.out.println(i);	
		}


	}
}
