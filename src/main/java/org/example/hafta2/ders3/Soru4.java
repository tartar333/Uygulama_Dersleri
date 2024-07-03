package org.example.hafta2.ders3;

import java.util.Scanner;

public class Soru4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("enter number 1 (0-100): ");
		int num1 = scanner.nextInt();
		System.out.print("enter number 2 (0-100): ");
		int num2 = scanner.nextInt();
		System.out.print("enter number 3 (0-100): ");
		int num3 = scanner.nextInt();
		System.out.print("enter number 4 (0-100): ");
		int num4 = scanner.nextInt();
		System.out.print("enter number 5 (0-100): ");
		int num5 = scanner.nextInt();
		
		int big = num1;
		int small = num1;
		
		if (num2 > big) {
			big = num2;
		}
		if (num3 > big) {
			big = num3;
		}
		if (num4 > big) {
			big = num4;
		}
		if (num5 > big) {
			big = num5;
		}
		
		if (num2 < small) {
			small = num2;
		}
		if (num3 < small) {
			small = num3;
		}
		if (num4 < small) {
			small = num4;
		}
		if (num5 < small) {
			small = num5;
		}
		
		// Sonuçların yazdırılması
		System.out.println("Biggest number : " + big);
		System.out.println("Smallest number : " + small);
	}
}