package com.human.ex;

public class quiz0228_07 {
	public static void main(String[] args) {
		//계산기
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.print("사칙 연산 입력(정수) : ");
		int a = Integer.parseInt(sc.next());
		String str = sc.next();
		int b = Integer.parseInt(sc.next());
		
		int ans = 0;
		if (str.equals("+")) {
			ans = a + b;
		} else if (str.equals("-")) {
			ans = a - b;
		} else if (str.equals("*")) {
			ans = a * b;
		} else if (str.equals("/")) {
			ans = a / b;
		}
		System.out.println(a+str+b+"="+ans);

		sc.close();
	}

}
