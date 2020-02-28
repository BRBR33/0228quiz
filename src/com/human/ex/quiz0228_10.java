package com.human.ex;

public class quiz0228_10 {
	public static void main(String[] args) {
		//제일 작은 수 출력하기
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.print("세 개의 정수를 입력하시오 : ");
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < 3; i++) {
			int a = Integer.parseInt(sc.next());
			if (min > a) {
				min = a;
			}
		}
		System.out.println("제일 작은 정수는 " + min + "입니다.");
		sc.close();
	}

}
