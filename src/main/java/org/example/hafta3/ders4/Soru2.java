package org.example.hafta3.ders4;

public class Soru2 {
	public static void main(String[] args) {
		Metodlar metodlar = new Metodlar();
		int sayi1 = 10;
		int sayi2 = 17;
		boolean tekMi1 = metodlar.tekMi(sayi1);
		boolean tekMi2 = metodlar.tekMi(sayi2);
		System.out.println(tekMi1+"\n"+tekMi2);
	}
}