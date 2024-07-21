package org.example.hafta2.ders5.Odev;

import java.util.Scanner;

public class Soru7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir tam sayi giriniz: ");
		int sayi = scanner.nextInt();
		scanner.close();
		int basamak;
		int basamakToplami = 0;
		while (sayi > 0) {
			basamak = sayi % 10;
			basamakToplami += basamak;
			sayi /= 10;
		}
		scanner.close();
		System.out.println("Sayinin basamaklari toplami = " + basamakToplami);
	}
}