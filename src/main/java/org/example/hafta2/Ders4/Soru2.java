package org.example.hafta2.Ders4;

import java.util.Locale;
import java.util.Scanner;

public class Soru2 {
	/*
	Dışarıdan bir değer alacağız. Bu değerin içerisinde kaç tane a harfi oldugunu yazdıracağız.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Bir kelime girin : ");
		int sayac = 0;
		String a = sc.nextLine();
		a=a.toLowerCase(); //harfleri küçült
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == 'a') {
				sayac++;
			}
		}
		System.out.println(sayac + " tane 'a' harfi vardir.");
	}
}