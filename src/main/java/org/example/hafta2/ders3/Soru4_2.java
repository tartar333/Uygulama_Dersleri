package org.example.hafta2.ders3;

import java.util.Scanner;

public class Soru4_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 1;
		int number;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		
		while(i<=5){
			System.out.print("Lutfen " + i + ". sayiyi giriniz: ");
			number = scanner.nextInt();
			if(number >= 0 && number <=100){
				if(number > max){
					max = number;
				}
				if(number < min){
					min = number;
				}
				i++;
			} else {
				System.out.println("Lutfen gecerli bir sayi giriniz ! (0 - 100)");
			}
		}
		
		System.out.println("Max = " + max +"\nMin = " + min);
		scanner.close();
	}
}