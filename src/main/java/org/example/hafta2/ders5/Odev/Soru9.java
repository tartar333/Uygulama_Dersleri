package org.example.hafta2.ders5.Odev;

import java.util.Scanner;

public class Soru9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Bir sayi girin : ");
		int sayi = sc.nextInt();
		
		String sayiStr = String.valueOf(sayi);
		
		StringBuilder tSayi = new StringBuilder();
		int index = sayiStr.length() - 1;
		while (index >= 0) {
			tSayi.append(sayiStr.charAt(index));
			index--;
		}
		sc.close();
		
		System.out.println("Sayinin ters hali: " + tSayi.toString());
	}
}