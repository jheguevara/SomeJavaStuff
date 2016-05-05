package com.mcnz.examples;

import java.util.Scanner;

public class TestExit {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while (true) {
			// prompt, get string and check for termination
			System.out.print("> ");
			String line = scanner.nextLine();
			if (line.equalsIgnoreCase("quit")) {
				break;
			}
		}
	}
}
