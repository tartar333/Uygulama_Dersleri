package org.example.hafta2.ders5.Odev;

import java.util.Scanner;

public class Soru3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1-7 arasinda bir sayi girin : ");
		int a = scanner.nextInt();
		switch (a) {
			case 1, 2, 3, 4, 5:
				System.out.println("Hafta Ici");
				break;
			case 6, 7:
				System.out.println("Hafta Sonu");
				break;
			default:
				System.out.println("Yanlis Deger Araliginda bir sayi girdiniz.");
		}
		scanner.close();
	}
}