package com.velocity.javacodes.exceptions;

public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			System.out.println("1");
			int i=10/0;
			}
			catch(NullPointerException e){
				System.out.println("2");
			try{
				System.out.println("3");
			int i=20/0;
			}
			catch(ArithmeticException a){
				System.out.println("4");
			a.printStackTrace();
			}
			}
			
		
	}

}
