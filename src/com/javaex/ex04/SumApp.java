package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");
		String numLine = sc.nextLine();
		String[]Array = numLine.split(" ");

		//코드를 작성하세요
		try {
			for (int i = 0; i < Array.length; i++) {
				sum += Integer.parseInt(Array[i]); //문자열 int 변경
			}
		} catch (Exception e) {
		}
		
		
		System.out.println("합:" + sum);
		
		sc.close();
	}

}
