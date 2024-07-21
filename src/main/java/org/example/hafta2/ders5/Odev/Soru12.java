package org.example.hafta2.ders5.Odev;

import java.util.Scanner;

public class Soru12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Taban degerini girin: ");
		double taban = scanner.nextDouble();
		System.out.print("Us degerini girin: ");
		double us = scanner.nextDouble();
		double sonuc = Math.pow(taban, us);
		System.out.println(taban + " uzeri " + us + " = " + sonuc);
		
		scanner.close();
	}
}