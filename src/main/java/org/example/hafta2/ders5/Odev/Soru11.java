package org.example.hafta2.ders5.Odev;

import java.util.Scanner;

public class Soru11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Bir kelime girin : ");
		int sayac = 0;
		String a = sc.nextLine();
		a=a.toLowerCase(); //harfleri küçült
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == 'a' || a.charAt(i) == 'e'|| a.charAt(i) == 'i'|| a.charAt(i) == 'o'|| a.charAt(i) == 'u' ) {
				sayac++;
			}
		}
		sc.close();
		System.out.println(sayac + " tane sesli harf vardir.");
	}
}