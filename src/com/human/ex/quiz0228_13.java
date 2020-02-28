package com.human.ex;

public class quiz0228_13 {
	public static void main(String[] args) {
		//국영수 점수
		java.util.Scanner sc = new java.util.Scanner(System.in);
		double kor = Double.parseDouble(sc.nextLine());
		double eng = Double.parseDouble(sc.nextLine());
		double mat = Double.parseDouble(sc.nextLine());
		
		double ave = (kor+eng+mat)/3;
		if(ave>=60) {
			if(kor>=60 && eng>=60 && mat>=60) {
				System.out.println("합격");
			}else {
				System.out.println("과락 탈락");
			}
		}else {
			System.out.println("평균미달 탈락");
		}
		
		sc.close();
	}

}
