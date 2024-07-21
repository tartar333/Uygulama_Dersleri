package org.example.hafta3.ders4;

import java.util.Scanner;

public class Soru9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Metodlar metodlar = new Metodlar();
		System.out.print("Toplamak istediginiz sayi adedi : ");
		int sayim = sc.nextInt();
		sc.nextLine();
		if (sayim ==2) {
			System.out.print("1.sayiyi giriniz : ");
			int sayi1 = sc.nextInt();
			System.out.print("2.sayiyi giriniz : ");
			int sayi2 = sc.nextInt();
			System.out.println("Sonuc : "+metodlar.topla(sayi1, sayi2));
		}
		else if(sayim ==3){
			System.out.print("1.sayiyi giriniz : ");
			int sayi1 = sc.nextInt();
			System.out.print("2.sayiyi giriniz : ");
			int sayi2 = sc.nextInt();
			System.out.print("3.sayiyi giriniz : ");
			int sayi3 = sc.nextInt();
			
			System.out.println("Sonuc : "+metodlar.topla(sayi1, sayi2, sayi3));
		}
		else{
			System.out.println("Lutfen 2 veya 3 sayi girin");
		}
	}
}