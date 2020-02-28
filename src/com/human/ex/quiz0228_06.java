package com.human.ex;

public class quiz0228_06 {
	public static void main(String[] args) {
		//옷 사이즈
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.print(" 나이 입력 : ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.print(" 가슴둘레 입력 : ");
		int ch = Integer.parseInt(sc.nextLine());
		char size;
		if (age >= 20) {
			if (ch >= 100) {
				size = 'L';
			} else if (ch < 100 && ch >= 90) {
				size = 'M';
			} else {
				size = 'S';
			}

		} else {
			if (ch >= 95) {
				size = 'L';
			} else if (ch < 95 && ch >= 85) {
				size = 'M';
			} else {
				size = 'S';
			}
		}

		System.out.println("사이즈는 " + size + " 입니다.");

		sc.close();
	}

}
