package org.example.hafta3.ders2;

public class Soru3 {
	/* Dizideki en buyuk 2. sayiyi bulalim.
-> 120, 130, 125, -256, 16, 1300, 1258, 81, 14 */
	public static void main(String[] args) {
		int[] numbers = {1258, 1300, 125, -256, 16, 1258, 81, 14};
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		
		for(int number : numbers){
			if(number>max1){
				max2=max1;
				max1=number;
			}else if(number > max2 && number != max1){
				max2=number;
			}
		}
		System.out.println("Dizideki en buyuk ikinci sayi: " + max2);
	}
}