package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		String gap;
		String[] Array;
		Friend[] friendArray = new Friend[3];
		Scanner sc = new Scanner(System.in);

		System.out.println("친구를 3명 등록해 주세요");

		for (int i = 0; i < friendArray.length; i++) {
			gap = sc.nextLine();
			Array = gap.split(" ");

			friendArray[i] = new Friend(Array[0], Array[1], Array[2]);
		}

		for (int i = 0; i < friendArray.length; i++) {
			friendArray[i].showInfo();
		}
		sc.close();
	}

}
