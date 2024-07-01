package org.example.hafta2.ders2;

import java.util.Scanner;

public class Soru3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int toplam = 0;
		int sayac = 0;
		System.out.println("0 girilene kadar sayı giriniz:");
		while(true) {
			int sayi=scanner.nextInt();;
			
			if(sayi==0){
				break;
			}
			toplam+=sayi;
			sayac++;
		}
	    double ortalama = (double)toplam/sayac;
		System.out.println("Girilen sayıların toplamı: " + toplam);
		System.out.println("Girilen sayıların ortalaması: " + ortalama);
	
	}
}