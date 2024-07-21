package org.example.hafta3.ders4;

import java.util.Arrays;

public class Soru5 {
	public static void main(String[] args) {
		Metodlar metodlar = new Metodlar();
		String metin = "Bugün hava çok güzel";
		String[] kelimeler = metodlar.metindekiKelimeleriBul(metin);
		System.out.println(Arrays.toString(kelimeler));
	    String kelimeTersi = metodlar.kelimeTersiBul(kelimeler);
		System.out.println(kelimeTersi);
	}
}