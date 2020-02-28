package com.human.ex;

public class quiz0228_08 {
	public static void main(String[] args) {
		//등록금
		int rich = 150;
		double grade = 4.1;
		double tuition = 100;
		double scholarship = 0;
		if (rich >= 100 && grade >= 4.0) {
			scholarship = tuition * 0.2;
		} else if (rich < 100) {
			scholarship = tuition * 0.4;
		}
		System.out.println("다음학기 납입할 등록금은 " + ((int) (tuition - scholarship)) + "만원 입니다.");

	}

}
