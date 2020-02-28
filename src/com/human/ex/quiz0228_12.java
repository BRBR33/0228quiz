package com.human.ex;

public class quiz0228_12 {
	public static void main(String[] args) {
		//제일 큰 수 출력하기
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());
		int b = Integer.parseInt(sc.nextLine());
		int c = Integer.parseInt(sc.nextLine());
		
		if(a>b) {
			if(a>c) {
				System.out.println(a);
			}else {
				System.out.println(c);
			}
		}else if(b>c) {
			System.out.println(b);
		}else {
			System.out.println(c);
		}
		
		sc.close();
	}

}
