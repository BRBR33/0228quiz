package com.human.ex;

public class quiz0228_05 {
	public static void main(String[] args) {
		//3,5,7 일때
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.print(" 입력 : ");
		int a = Integer.parseInt(sc.nextLine());
		int b;
		switch (a) {
		case 3:
			b = 1;
			break;
		case 5:
			b = 2;
			break;
		case 7:
			b = 3;
			break;
		default:
			b = 0;
		}
		System.out.println("b = "+b);
		sc.close();
	}

}
