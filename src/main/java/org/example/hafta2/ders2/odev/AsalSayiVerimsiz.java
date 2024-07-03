package org.example.hafta2.ders2.odev;

import java.util.Scanner;

public class AsalSayiVerimsiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		long number = sc.nextLong();
		long startTime = System.currentTimeMillis();
		int counter = 0;
		if (number == 2) {
			System.out.println("This is a Prime Number.");
		}
		else if(number<=1){
			System.out.println("This is not Prime Number");
		}
		else {
			for (long i = 1; i <= number; i++) {
				if (number % i == 0) {
					counter++;
				}
			}
			if (counter <= 2) {
				System.out.println("This is a Prime Number.");
			}
			else {
				System.out.println("This is not a Prime Number.");
			}
		}
		sc.close();
		long endTime = System.currentTimeMillis();
		long elapsedTime = endTime - startTime;
		System.out.println(elapsedTime + " ms : Execution Time");
	}
}