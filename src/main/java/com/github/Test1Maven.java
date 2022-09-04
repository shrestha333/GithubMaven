package com.github;

import java.util.Scanner;

public class Test1Maven {

	public static void main(String[] args) {
		System.out.println("are you hungry");
		Scanner sc = new Scanner(System.in);
		String word = sc.next();

		if (word.equals("yes") || word.equals("Y") || word.equals("y") || word.equals("yeah")) {
			System.out.println("eat something");
		} else {
			System.out.println("do work");

			sc.close();
		}
	}
}
