package org.example.hafta2.ders5.Odev;

import java.util.Scanner;

public class Soru2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1-12 arasinda bir sayi girin : ");
		int a = scanner.nextInt();
		switch (a) {
			case 1:
				System.out.println("Ocak");
				break;
			case 2:
				System.out.println("Subat");
				break;
			case 3:
				System.out.println("Mart");
				break;
			case 4:
				System.out.println("Nisan");
				break;
			case 5:
				System.out.println("Mayis");
				break;
			case 6:
				System.out.println("Haziran");
				break;
			case 7:
				System.out.println("Temmuz");
				break;
			case 8:
				System.out.println("Agustos");
				break;
			case 9:
				System.out.println("Eylul");
				break;
			case 10:
				System.out.println("Ekim");
				break;
			case 11:
				System.out.println("Kasim");
				break;
			case 12:
				System.out.println("Aralik");
				break;
			default:
				System.out.println("Yanlis Deger Araliginda bir sayi girdiniz.");
		}
		scanner.close();
	}
}