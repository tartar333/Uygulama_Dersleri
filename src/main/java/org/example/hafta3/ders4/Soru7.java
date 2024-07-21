package org.example.hafta3.ders4;

import java.util.Arrays;

public class Soru7 {
	public static void main(String[] args) {
		Metodlar metodlar = new Metodlar();
		int[] dizi ={2,3,5,1,7,9};
		int[] enBuyuk3Sayi = metodlar.enBuyukNsayi(dizi,3);
		System.out.println(Arrays.toString(enBuyuk3Sayi));
	}
}