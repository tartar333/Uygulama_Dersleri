package org.example.hafta2.ders2;

import java.util.Scanner;

public class Soru4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Carpim Tablosu Olusturulacak Sayiyi Giriniz : ");
		int sayi = scanner.nextInt();
		int sonuc;
		for(int i=1; i<=10; i++){
			sonuc=sayi*i;
			System.out.println(sayi+" x "+i+" = "+sonuc);
		}
	
	
	}
}