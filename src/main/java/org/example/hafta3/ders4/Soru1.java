package org.example.hafta3.ders4;

public class Soru1 {
	public static void main(String[] args) {
		Metodlar metodlar = new Metodlar();
		int arr[] = {1,2,3,4,5};
		double ortalama = metodlar.ortalamaHesapla(arr);
		System.out.println("ortalama : "+ortalama);
		
		double ortalama2 = metodlar.ortalamaHesapla(new int[]{5,10});
		System.out.println("ortalama2 : "+ortalama2);
	}
}