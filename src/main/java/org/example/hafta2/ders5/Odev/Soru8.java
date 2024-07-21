package org.example.hafta2.ders5.Odev;

import java.util.Scanner;

public class Soru8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sayi;
		int b = 1;
		while (true) {
			System.out.print("Pozitif bir tamsayi giriniz : ");
			sayi = scanner.nextInt();
			if (sayi >= 0){
				for (int i = 2; i <= sayi; i++) {
					b = b * i;
				}
				System.out.println("Girilen sayinin faktoriyeli : "+b);
				b=1;
			}
			else{
				System.out.println("Negatif bir sayi girildi cikis yapiliyor.");
				break;
			}
		}
		scanner.close();
	}
}