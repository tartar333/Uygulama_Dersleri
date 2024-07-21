package org.example.hafta2.ders5.Odev;

import java.util.Scanner;

public class Soru6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Pozitif bir sayi girin, negatif girdiginizde program durur : ");
		float b = 0;
		float a;
		do {
			a = scanner.nextFloat();
			if (a >= 0) b = a + b;
		} while (a >= 0);
		scanner.close();
		System.out.println("Girdiginiz sayilarin toplami : " + b);
	}
}