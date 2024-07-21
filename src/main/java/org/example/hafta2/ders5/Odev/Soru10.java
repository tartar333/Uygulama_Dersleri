package org.example.hafta2.ders5.Odev;

import java.util.Scanner;

public class Soru10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir cümle girin : ");
		String cumle = scanner.nextLine();
		int baslangic = 0;
		int bitis = 0;
		while (bitis < cumle.length()) {
			while (bitis < cumle.length() && cumle.charAt(bitis) != ' ') {
				bitis++;
			}
			String kelime = cumle.substring(baslangic, bitis);
			System.out.println(kelime);
			while (bitis < cumle.length() && cumle.charAt(bitis) == ' ') {
				bitis++;
			}
			baslangic = bitis;
		}
		scanner.close();
	}
}