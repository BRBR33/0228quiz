package com.human.ex;

public class quiz0228_01 {
	public static void main(String[] args) {

		int a = 3, b = 0;
		switch (a + 2) {
		case 5:
			b = 1;
		default:
			b += 2;
		}
		System.out.println("b = " + b);

	}

}
//실행결과 : b = 3