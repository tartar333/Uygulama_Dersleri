package org.example.hafta2.ders2;

import java.util.Scanner;

public class Soru6 {
	public static void main(String[] args) {
	    int tkod=111;
	    int mkod=222;
	    int a,b;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Telefon kodunu giriniz : ");
     	a=scanner.nextInt();
		 if(tkod!=a) {
			 System.out.println("Telefon kodunu hatali girdiniz.");
		 }
		 else{
			 System.out.print("Mail kodunu giriniz : ");
			 b=scanner.nextInt();
			 if(mkod!=b){
				 System.out.println("Mail kodunu hatali girdiniz.");
			 }
			 else {
				 System.out.println("Basariyla giris yapildi");
			 }
		 }
	
	
	
	}
}