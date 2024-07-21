package org.example.hafta3.ders2;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Soru1 {
	/* 1- Dışarıdan girilen ülke ismi bizim array'imizde bulunuyor mu? Kontrol edelim.
			-> Türkiye, Japonya, Moğolistan, Amerika, Rusya, Çin */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] sehir = {"Türkiye","Japonya","Mogolistan","Amerika","Rusya","Cin"};
		String a = scanner.nextLine();
		for (int i=0; i<sehir.length; i++){
			if(sehir[i].equalsIgnoreCase(a)){
				System.out.println("Disardan alinan isim arrayimizde var.");
				break;

			}
		}
	}
}