package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 0;

		// 값 입력받기
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print(">> ");
			String numLine = sc.nextLine();
			
			// 띄어쓰기로 쪼개기
			String[] numArray = numLine.split(" ");
			
			// 문자열 -> 정수
			if(numArray[0].equals("/q")) {
				System.out.println("종료합니다.");
				break;
			} else {
				num1 = Integer.parseInt(numArray[0]);
				num2 = Integer.parseInt(numArray[2]);
			}
			
			Add add = new Add(num1, num2);
			Sub sub = new Sub(num1, num2);
			Div div = new Div(num1, num2);
			Mul mul = new Mul(num1, num2);
			
			if (numArray[1].equals("+")) {
				System.out.println(">> " + add.calculate());
			} else if (numArray[1].equals("-")) {
				System.out.println(">> " + sub.calculate());
			} else if (numArray[1].equals("/")) {
				System.out.println(">> " + div.calculate());
			} else if (numArray[1].equals("*")) {
				System.out.println(">> " + mul.calculate());
			} else {
				System.out.println("알 수 없는 연산입니다.");
			}
		}
		sc.close();
	}



}
