package com.velocity.javacodes.exceptions;

public class Exception2 {
	String str = "a";

	void a() {
		try {
			str += "b";
			b();
		} catch (Exception e) {
			str += "c";
		}
	}
	void b() {
		try {
			str += "d";
		} catch (Exception e) {
			str += "e";
		} finally {
			str += "f";
		}
		System.out.println(str);
	}
	public static void main(String[] args) {
		Exception2 d = new Exception2();
		d.a();
	}
}
