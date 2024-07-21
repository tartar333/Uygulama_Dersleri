package org.example.hafta3.ders2;

public class Soru5 { /* Dizideki bütün sayıların toplamını yazdıralım.
Dizinin her bir elemanı için;
çift ise çifttir, tek ise tektir yazdıralım.
-> 0, 120, 5, 85, -256, 16, 1258, 81, 14 */
	public static void main(String[] args) {
		int numbers[] = {0, 120, 5, 85, -256, 16, 1258, 81, 14};
		int toplam = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				System.out.println(numbers[i] + " Sayisi Cifttir.");
			}
			else {
				System.out.println(numbers[i] + " Sayisi Tektir.");
			}
			toplam = toplam + numbers[i];
		}
		System.out.println("Toplam = "+toplam);
	}
}