package com.human.ex;

public class quiz0228_02_2 {
	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.print("월번호를 입력하시오(1-12) : ");
		int Month = Integer.parseInt(sc.nextLine());

		switch (Month) {
		case 1:
			System.out.println("Jan");
			break;
		case 2:
			System.out.println("Feb");
			break;
		case 3:
			System.out.println("Mar");
			break;
		case 4:
			System.out.println("Apr");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("Jun");
			break;
		case 7:
			System.out.println("Jul");
			break;
		case 8:
			System.out.println("Aug");
			break;
		case 9:
			System.out.println("Sep");
			break;
		case 10:
			System.out.println("Oct");
			break;
		case 11:
			System.out.println("Nov");
			break;
		case 12:
			System.out.println("Dec");
			break;
		default:
			System.out.println("1-12 사이로 입력하시오.");
		}

		sc.close();
	}

}
