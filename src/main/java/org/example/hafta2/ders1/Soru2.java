package org.example.hafta2.ders1;

public class Soru2 {
	public static void main(String[] args) {
		int a, b;
		a = 0;
		b = 1;
		
		while (a < 50) {
			a = a + b;
			b++;
		}
		b=b-1;
		System.out.println("Birden gelen sayilarin toplami = " +a+ " 'dir. Toplam döngü sayisi = " + b);
		
		
	}
}