package org.example.hafta2.ders5.Odev;

import java.util.Random;

public class Soru14 {
	public static void main(String[] args) {
		Random random = new Random();

		int sayi = random.nextInt(50) + 1;
		
		System.out.println("Uretilen sayi: " + sayi);

		if (sayi % 2 == 0) {
			System.out.println(sayi + " sayisi çift bir sayidir.");
		} else {
			System.out.println(sayi + " sayisi tek bir sayidir.");
		}
	}
}