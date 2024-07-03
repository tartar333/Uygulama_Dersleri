package org.example.hafta2.ders2;

import java.util.Scanner;

public class Soru1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Taban degerini giriniz : ");
		int taban = scanner.nextInt();
		System.out.print("Us degerini giriniz : ");
		int us = scanner.nextInt();
		scanner.nextLine(); // scanner.nextInt(); den gelen '\n' yutulsun diye eklendi.
		int sonuc=1;
		int sayac=0;
		while(us>0){
			sonuc = sonuc*taban ;
			us--;
			sayac++;
		}
		System.out.print("Kullanici adinizi giriniz : ");
		String kullanici_adi= scanner.nextLine();
		System.out.println(kullanici_adi+" "+taban+" uzeri "+sayac+" isleminin sonucu : "+sonuc+" olur");
		
		
	
	}
}