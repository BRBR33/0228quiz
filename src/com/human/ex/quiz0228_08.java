package com.human.ex;

public class quiz0228_08 {
	public static void main(String[] args) {
		//��ϱ�
		int rich = 150;
		double grade = 4.1;
		double tuition = 100;
		double scholarship = 0;
		if (rich >= 100 && grade >= 4.0) {
			scholarship = tuition * 0.2;
		} else if (rich < 100) {
			scholarship = tuition * 0.4;
		}
		System.out.println("�����б� ������ ��ϱ��� " + ((int) (tuition - scholarship)) + "���� �Դϴ�.");

	}

}
