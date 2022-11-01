package com.velocity.javacodes.number;

public class Broadrigde {

	
	public static int getNumberOfoccurances(int x, int y) {
		int count = 0;
		
		while (x>0) {
			int rem=x%10;
			if (rem==y) {
				count++;
			}
			x=x/10;
		}
		return count;
	}
	
	public static void main(String[] args) {
		int x=115;
		int y=1;
		int numberOfOccurance = Broadrigde.getNumberOfoccurances(x, y);
		
		System.out.println(numberOfOccurance);
		
	}
}
