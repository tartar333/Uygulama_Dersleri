package org.example.hafta2.ders2.odev;

import java.util.Scanner;

public class AsalSayiVerimli {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		long number = sc.nextLong();
		sc.close();
		long startTime = System.currentTimeMillis();
		
		if (number <= 1 || number % 2 == 0) {
			System.out.println("This is not a Prime Number.");
		} else if (number == 2) {
			System.out.println("This is a Prime Number.");
		} else {
			boolean isPrime = true;
			for (long i = 3; i <= Math.sqrt(number) ; i += 2) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println("This is a Prime Number.");
			} else {
				System.out.println("This is not a Prime Number.");
			}
		}
		
		long endTime = System.currentTimeMillis();
		long elapsedTime = endTime - startTime;
		System.out.println(elapsedTime + " ms : Execution Time");
		
		
	}
}