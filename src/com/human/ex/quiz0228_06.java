package com.human.ex;

public class quiz0228_06 {
	public static void main(String[] args) {
		//�� ������
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.print(" ���� �Է� : ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.print(" �����ѷ� �Է� : ");
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

		System.out.println("������� " + size + " �Դϴ�.");

		sc.close();
	}

}
