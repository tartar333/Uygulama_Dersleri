package org.example.hafta3.ders4;

import java.util.Scanner;

public class Soru6 {
	public static void main(String[] args) {
		Metodlar metodlar = new Metodlar();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayi giriniz : ");
		long tamsayi = scanner.nextLong();
		System.out.println(metodlar.asalMi(tamsayi));
		
	}
}