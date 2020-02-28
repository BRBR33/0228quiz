package com.human.ex;

public class quiz0228_11 {
	public static void main(String[] args) {
		//가위바위보
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.print("선택하시오(1: 가위  2: 바위 3: 보) : ");
		int a = Integer.parseInt(sc.nextLine());
		java.util.Random rn = new java.util.Random();
		int b = rn.nextInt(3) + 1;

		switch (a) {
		case 1:
			switch (b) {
			case 1:
				System.out.println("비겼음");
				break;
			case 2:
				System.out.println("컴퓨터 이김");
				break;
			case 3:
				System.out.println("사용자 이김");
				break;
			}
			break;
		case 2:
			switch (b) {
			case 1:
				System.out.println("사용자 이김");
				break;
			case 2:
				System.out.println("비겼음");
				break;
			case 3:
				System.out.println("컴퓨터 이김");
				break;
			}
			break;
		case 3:
			switch (b) {
			case 1:
				System.out.println("컴퓨터 이김");
				break;
			case 2:
				System.out.println("사용자 이김");
				break;
			case 3:
				System.out.println("비겼음");
				break;
			}
			break;
		default:
			System.out.println("1-3 중에서만 입력하세요");
		}
		sc.close();
	}

}
