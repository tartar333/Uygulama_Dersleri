package org.example.hafta3.ders3;

public class Soru1 {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		for (int i = 0; i < arr.length; i++) {
			tekmi(arr[i]);
		}
	}
	
	public static void tekmi(int a) {
		if (a % 2 == 1) {
			System.out.println(a + " : Tektir");
		}
		else {
			System.out.println(a + " : Cifttir.");
		}
		
	}
}