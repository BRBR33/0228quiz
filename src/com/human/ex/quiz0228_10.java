package com.human.ex;

public class quiz0228_10 {
	public static void main(String[] args) {
		//���� ���� �� ����ϱ�
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.print("�� ���� ������ �Է��Ͻÿ� : ");
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < 3; i++) {
			int a = Integer.parseInt(sc.next());
			if (min > a) {
				min = a;
			}
		}
		System.out.println("���� ���� ������ " + min + "�Դϴ�.");
		sc.close();
	}

}
