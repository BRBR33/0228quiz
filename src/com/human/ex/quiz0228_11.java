package com.human.ex;

public class quiz0228_11 {
	public static void main(String[] args) {
		//����������
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.print("�����Ͻÿ�(1: ����  2: ���� 3: ��) : ");
		int a = Integer.parseInt(sc.nextLine());
		java.util.Random rn = new java.util.Random();
		int b = rn.nextInt(3) + 1;

		switch (a) {
		case 1:
			switch (b) {
			case 1:
				System.out.println("�����");
				break;
			case 2:
				System.out.println("��ǻ�� �̱�");
				break;
			case 3:
				System.out.println("����� �̱�");
				break;
			}
			break;
		case 2:
			switch (b) {
			case 1:
				System.out.println("����� �̱�");
				break;
			case 2:
				System.out.println("�����");
				break;
			case 3:
				System.out.println("��ǻ�� �̱�");
				break;
			}
			break;
		case 3:
			switch (b) {
			case 1:
				System.out.println("��ǻ�� �̱�");
				break;
			case 2:
				System.out.println("����� �̱�");
				break;
			case 3:
				System.out.println("�����");
				break;
			}
			break;
		default:
			System.out.println("1-3 �߿����� �Է��ϼ���");
		}
		sc.close();
	}

}
