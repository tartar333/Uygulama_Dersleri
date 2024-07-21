package org.example.hafta2.ders5.Odev;

import java.util.Random;

public class Soru15 {
	public static void main(String[] args) {
		Random random = new Random();

		int sayi = random.nextInt();

		System.out.println("Uretilen sayi: " + sayi);

		if (sayi >= 1 && sayi <= 10) {
			System.out.println(sayi + " sayisi 1 ile 10 arasindadir.");
		} else {
			System.out.println(sayi + " sayisi 1 ile 10 arasinda degildir.");
		}
	}
}