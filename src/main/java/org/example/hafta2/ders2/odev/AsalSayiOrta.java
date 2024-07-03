package org.example.hafta2.ders2.odev;

import java.util.Scanner;

public class AsalSayiOrta {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = sc.nextInt();
		sc.close();
		long startTime = System.currentTimeMillis();
		int counter = 0;
		if (number % 2 == 0 && number != 2) {
			System.out.println("This is not Prime Number.");
		}
		else if (number == 2) {
			System.out.println("This is a Prime Number.");
		}
		else if (number <= 1) {
			System.out.println("This is not Prime Number");
		}
		else {
			for (int i = 3; i <= number / 3; i++) {
				if (number % i == 0) {
					counter++;
					break;
				}
			}
			if (counter == 0) {
				System.out.println("This is a Prime Number.");
			}
			else {
				System.out.println("This is not a Prime Number.");
			}
		}
		long endTime = System.currentTimeMillis();
		long elapsedTime = endTime - startTime;
		System.out.println(elapsedTime + " ms : Execution Time");
		
		
	}
}