package org.example.hafta3.ders4;

import java.util.Scanner;

public class Soru10 {
	public static void main(String[] args) {
		Metodlar metodlar = new Metodlar();
		Scanner scanner = new Scanner(System.in);
		String cumle = scanner.nextLine();
		System.out.println("Duzenlenmis Cumle : "+metodlar.transformTurkishLetters(cumle));
	}
}