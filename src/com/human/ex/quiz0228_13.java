package com.human.ex;

public class quiz0228_13 {
	public static void main(String[] args) {
		//������ ����
		java.util.Scanner sc = new java.util.Scanner(System.in);
		double kor = Double.parseDouble(sc.nextLine());
		double eng = Double.parseDouble(sc.nextLine());
		double mat = Double.parseDouble(sc.nextLine());
		
		double ave = (kor+eng+mat)/3;
		if(ave>=60) {
			if(kor>=60 && eng>=60 && mat>=60) {
				System.out.println("�հ�");
			}else {
				System.out.println("���� Ż��");
			}
		}else {
			System.out.println("��չ̴� Ż��");
		}
		
		sc.close();
	}

}
