package com.human.ex;

public class quiz0228_07 {
	public static void main(String[] args) {
		//����
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.print("��Ģ ���� �Է�(����) : ");
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
