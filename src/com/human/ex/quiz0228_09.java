package com.human.ex;

public class quiz0228_09 {
	public static void main(String[] args) {
		//전기세
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("전기 사용량을 입력하세요(kw) : ");
		double e = Double.parseDouble(sc.nextLine());
		double bfee = 0;
		double kf1 = 52.00, kf2 = 88.50, kf3 = 127.80, kf4 = 184.30, kf5 = 274.30, kf6 = 494.00;
		int tfee = 0;

		if (e > 0 && e <= 100) {
			bfee = 370;
			tfee = (int) ((bfee + e * kf1) * 1.09);
		} else if (e > 100 && e <= 200) {
			bfee = 660;
			tfee = (int) ((bfee + (100 * kf1 + (e % 100) * kf2)) * 1.09);
		} else if (e > 200 && e <= 300) {
			bfee = 1130;
			tfee = (int) ((bfee + (100 * kf1 + 100 * kf2 + (e % 100) * kf3)) * 1.09);
		} else if (e > 300 && e <= 400) {
			bfee = 2710;
			tfee = (int) ((bfee + (100 * kf1 + 100 * kf2 + 100 * kf3 + (e % 100) * kf4)) * 1.09);
		} else if (e > 400 && e <= 500) {
			bfee = 5130;
			tfee = (int) ((bfee + (100 * kf1 + 100 * kf2 + 100 * kf3 + 100 * kf4 + (e % 100) * kf5)) * 1.09);
		} else {
			bfee = 9330;
			tfee = (int) ((bfee
					+ (100 * kf1 + 100 * kf2 + 100 * kf3 + +100 * kf4 + 100 * kf5 + (e % 100) * kf6)) * 1.09);
		}

		System.out.println("이번 달 요금은 " + tfee + "원입니다.");
		sc.close();
	}

}
