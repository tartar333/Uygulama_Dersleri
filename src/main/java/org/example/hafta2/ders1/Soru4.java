package org.example.hafta2.ders1;

import java.util.Scanner;

public class Soru4 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen Yasinizi Giriniz : ");
		int age = scanner.nextInt();
		
		scanner.nextLine(); // scanner.nextInt den gelen \n i yutsun diye ekledik.
		
		System.out.print("Lütfen Adinizi Giriniz : ");
		String name = scanner.nextLine();
		System.out.println(name + " " + age);
		scanner.close(); // Scanner'ı kapatmak için gerekli ifade. Mutlaka eklenmeli.
		
		
	}
}