package org.example.hafta2.ders1;
import java.util.Scanner;

public class Soru3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir tam sayı giriniz: ");
		int sayi = scanner.nextInt();
		scanner.close();
		int basamak;
		int basamakToplami=0;
		while(sayi>0) {
			basamak = sayi % 10;
			basamakToplami += basamak; //basamakToplami = basamakToplami + basamak
			sayi /= 10; //sayi = sayi/10
		}
		System.out.println("Sayinin basamaklari toplami = " +basamakToplami);
  }
}