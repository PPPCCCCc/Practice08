package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a;
		int b;
		int sum;
		String c;

		while (true) {
			System.out.print(">> ");
			c = sc.nextLine();

			if (c.equals("/q")) {
				System.out.println("종료");
				break;
			}
			String[] Array = c.split(" ");
			a = Integer.parseInt(Array[0]);
			b = Integer.parseInt(Array[2]);

			switch (Array[1]) {
			case "+":
				Add add = new Add();
				sum = add.calculate();
				System.out.println(sum);
				break;
			case "-":
				Sub sub = new Sub();
				sum = sub.calculate();
				System.out.println(sum);
				break;
			case "*":
				Mul mul = new Mul();
				sum = mul.calculate();
				System.out.println(sum);
				break;
			case "/":
				Div div = new Div();
				sum = div.calculate();
				System.out.println(sum);
				break;
			default:
				System.out.println("알 수 없는 연산입니다.");
			}
		}
	}
}