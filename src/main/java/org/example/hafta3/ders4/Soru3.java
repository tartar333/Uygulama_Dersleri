package org.example.hafta3.ders4;

import java.util.Arrays;

public class Soru3 {
	public static void main(String[] args) {
		Metodlar metodlar = new Metodlar();
		int[] dizi={1,2,5,4,3};
        metodlar.sirala(dizi);
		metodlar.sirala2(dizi);
		System.out.println(Arrays.toString(dizi));
		
	}
}