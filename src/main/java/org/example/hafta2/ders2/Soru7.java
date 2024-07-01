package org.example.hafta2.ders2;

import java.util.Scanner;

public class Soru7 {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.print("Bir sayi giriniz : ");
		int sayi= scanner.nextInt();
		int sayac=0;
		int sayi2;
		sayi2=sayi;
		if(sayi%5==0){
			while(sayi>1) {
				sayi/=5;
				sayac++;
			}
            for(int i = 0; i<sayac; i++)
			{
				sayi*=5;
			}
			if(sayi==sayi2){
				System.out.println("Girilen sayi 5'in "+sayac+"'inci kuvvetidir.");
			}
			else{
				System.out.println("Girilen sayi 5'in kuvveti degildir.");
			}
		}
		else{
			System.out.println("Girilen sayi 5'in kuvveti degildir.");
			}
			
		}
		
	
	
}