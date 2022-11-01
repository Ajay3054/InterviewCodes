package com.velocity.javacodes.number;
//How can u write dynamically from 1 to 10 elements without
//using integrator or for loops or any types of loops


public class DynamicNumber {
	

	private static void printNos(int n) {
		if(n > 0)
        {
            printNos(n - 1);
            System.out.print(n + " ");
        }
        return;
	}

	public static void main(String[] args) {
		
		int n = 10;

		printNos(10);
		
		
	}


}
