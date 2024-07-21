package org.example.hafta3.ders2;

public class Soru4 { /* Bir dizide ard arda gelen 2 indexdeki sayı değeri 2 ise true yazdırıp
döngüyü sonlandiralim yoksa false yazsin.
-> 2, -256, 2, 1258, 2, 2 */
	public static void main(String[] args) {
		int numbers[] = {2, -256, 2, 1258, 2, 2};
		boolean kontrol = false;
		for (int i = 0; i < numbers.length-1; i++) {
			if (numbers[i] == 2) {
				if (numbers[i + 1] == 2) {
					kontrol = true;
					break;
				}
			}
		}
		System.out.println(kontrol+" ");
	}
}