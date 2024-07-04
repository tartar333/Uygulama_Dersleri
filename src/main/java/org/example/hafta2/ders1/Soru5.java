package org.example.hafta2.ders1;

import java.util.Scanner;

public class Soru5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int b=1;
		System.out.print("Faktoriyel hesaplayacaginiz sayiyi girin : ");
		int a= scanner.nextInt();
		for(int i=2; i<=a; i++) {
			
			b=b*i;
			
		}
		System.out.println("Girilen sayinin faktoriyeli = "+b+"'dir");
	}
}