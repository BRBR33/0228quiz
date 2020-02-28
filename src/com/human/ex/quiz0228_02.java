package com.human.ex;

public class quiz0228_02 {
	public static void main(String[] args) {

		int count = 2; 
		int hap = 0;
		switch (++count) {
		case 1 : hap = hap + count++;
		case 2 : hap = hap + count++;
		case 3 : hap = hap + count++;
		case 4 : hap = hap + count++;
		case 5 : hap = hap + count++;
		}
		System.out.println("hap의 값 = " + hap);
	
	}

}
//실행결과 : hap의 값 = 12