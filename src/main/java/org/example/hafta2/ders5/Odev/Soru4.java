package org.example.hafta2.ders5.Odev;

import java.util.Scanner;

public class Soru4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir tam sayi giriniz : ");
		int a = scanner.nextInt();
		for (int i = 2; i <= a; i++) {
			if (i % 2 == 0) {
				System.out.print(" " + i);
			}
		}
		scanner.close();
		System.out.println("\nGirmis oldugunuz sayiya kadar olan cift sayilar bunlardir.");
	}
}