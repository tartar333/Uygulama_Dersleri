package org.example.hafta3.ders2;

import java.util.Scanner;

public class Soru2 {
	/* En büyük ve en küçük sayiyi tespit edelim.
-> 0, 120, 5, 85, -256, 16, 1258, 81, 14 */
	public static void main(String[] args) {
		int numbers[] = {0, 120, 5, 85, -256, 16, 1258, 81, 14};
		int buyuk = numbers[0];
		int kucuk = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (buyuk < numbers[i]) {
				buyuk = numbers[i];
			}
			if (kucuk > numbers[i]) {
				kucuk = numbers[i];
			}
		}
		System.out.println("En buyuk sayi : " + buyuk + "\nEn kucuk sayi : " + kucuk);
	}
}