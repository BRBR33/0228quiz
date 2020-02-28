package com.human.ex;

public class quiz0228_04 {
	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.print("두 정수 입력 : ");
		int a = Integer.parseInt(sc.nextLine());
		int b = Integer.parseInt(sc.nextLine());
		int res;
		if(a>=10) {
			res = a;
			
		}else if(b!=0) {
			res = a / b;
			
		}else {
			res = a;
			
		}
		System.out.println(res);
		sc.close();
	}
	
}
