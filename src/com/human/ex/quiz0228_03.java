package com.human.ex;

public class quiz0228_03 {
	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.print("���� �Է� : ");
		int n = Integer.parseInt(sc.nextLine());

		switch (n % 3) {
		case 0:
			System.out.println("����");
			break;
		default:
			System.out.println("��");
			break;
			
		}
		sc.close();
	}

}
// ��ĭ���� default: