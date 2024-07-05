package org.example.hafta2.ders5;

import java.util.Scanner;

public class Soru1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Kare kenar uzunluğunu giriniz: ");
		int kenarUzunlugu = scanner.nextInt();
		
		for (int i = 0; i < kenarUzunlugu; i++) {
			for (int j = 0; j < kenarUzunlugu; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		scanner.close();
	}
}