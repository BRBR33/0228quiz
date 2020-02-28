package com.human.ex;

public class quiz0228_03 {
	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.print("Á¤¼ö ÀÔ·Â : ");
		int n = Integer.parseInt(sc.nextLine());

		switch (n % 3) {
		case 0:
			System.out.println("°ÅÁş");
			break;
		default:
			System.out.println("Âü");
			break;
			
		}
		sc.close();
	}

}
// ºóÄ­¿¡´Â default: