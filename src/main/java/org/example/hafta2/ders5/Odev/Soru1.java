package org.example.hafta2.ders5.Odev;

import java.util.Scanner;

public class Soru1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1.Kenar Uzunlugunu Giriniz: ");
		int a = scanner.nextInt();
		System.out.print("2.Kenar Uzunlugunu Giriniz: ");
		int b = scanner.nextInt();
		System.out.print("3.Kenar Uzunlugunu Giriniz: ");
		int c = scanner.nextInt();
		if (a == b && a == c) {
			System.out.println("Eskenar Ucgendir. ");
		}
		else if (a == b || b == c || a == c) {
			System.out.println("Ikizkenar Ucgendir. ");
		}
		else {
			System.out.println("Cesitkenar Ucgendir. ");
		}
		scanner.close();
	}
}