package org.example.hafta2.ders5.Odev;

import java.util.Scanner;

public class Soru13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Bir sayi girin: ");
		double sayi = scanner.nextDouble();
		
		long yuvarlanmisSayi = Math.round(sayi);
		
		System.out.println(sayi + " sayisinin en yakin tam sayiya yuvarlanmis hali: " + yuvarlanmisSayi);
		
		scanner.close();
	}
}