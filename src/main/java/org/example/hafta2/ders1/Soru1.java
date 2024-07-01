package org.example.hafta2.ders1;

import java.util.Scanner;

public class Soru1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir tam sayi giriniz: ");
		int a = scanner.nextInt();
		scanner.close();
		int b, c = 0;
		
		for (int i = 1; i <= a; i++) {
			b = i + 1;
			c = b + c;
			
		}
		System.out.println(c);
		
	}
	
}