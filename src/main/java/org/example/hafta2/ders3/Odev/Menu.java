package org.example.hafta2.ders3.Odev;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Hosgeldiniz!/Welcome!");
		Thread.sleep(1000);
		System.out.print("Lutfen goruntuleme dilini seciniz. / Please select display language.\n 1--Turkish(TR) / " +
				                 "Turkce icin '1'e basin" + " \n " + "2--English(EN)/For English press number '2'\n ");
		System.out.print("Secmek istediginiz tusa basiniz / Press the key you want to select : ");
		int select = sc.nextInt();
		if (select != 1 && select != 2) {
			System.out.println("Belirtilen tuslarina basmadiginiz icin program sonlandirildi.\nThe program was " +
					                   "terminated because you did not press the specified keys. ");
		}
		if (select == 1) {
			while (select == 1) {
				System.out.println("1-- Merhaba Dunya yazdir.\n" + "2-- Faktoriyel Hesapla.\n" + "3-- Asal sayi " +
						                   "kontrolu yap.\n" + "0-- Cikmak icin farkli bir tusa basin\n");
				System.out.print("Secmek istediginiz tusa basiniz : ");
				int tSelect = sc.nextInt();
				switch (tSelect) {
					case 1:
						System.out.println("Merhaba Dunya");
						Thread.sleep(1500);
						break;
					case 2:
						System.out.print("Faktoriyelini istediginiz sayiyi girin : ");
						int a = sc.nextInt();
						int b = 1;
						for (int i = 1; i <= a; i++) {
							b = b * i;
							
						}
						System.out.println("Girilen sayinin Faktoriyeli : " + b + "'dir.");
						Thread.sleep(3000);
						break;
					case 3:
						System.out.println("Bir sayi giriniz : ");
						long number = sc.nextLong();
						if (number == 2) {
							System.out.println("Asal Sayidir.");
						}
						else if (number <= 1 || number % 2 == 0) {
							System.out.println("Asal Sayi Degildir.");
						}
						else {
							boolean isPrime = true;
							for (long i = 3; i <= Math.sqrt(number); i += 2) { //karekök alma
								if (number % i == 0) {
									isPrime = false;
									break;
								}
							}
							if (isPrime) {
								System.out.println("Asal Sayidir.");
							}
							else {
								System.out.println("Asal Sayi Degildir.");
							}
						}
						Thread.sleep(3000);
						break;
					default:
						System.out.println("Farkli bir tusa bastiniz cikis yapiliyor...");
						Thread.sleep(2000);
						select = 5;
						break;
				}
			}
		}
		if (select == 2) {
			while (select == 2) {
				System.out.println("1-- Print 'Hello World!'.\n" + "2-- Calculate The Factorial.\n" + "3-- Do a Prime" + " " + "Number Check.\n" + "0-- Press different key to exit\n");
				System.out.print("Please select the action you want to perform : ");
				int tSelect = sc.nextInt();
				switch (tSelect) {
					case 1:
						System.out.println("Hello World!");
						Thread.sleep(1500);
						break;
					case 2:
						System.out.print("Enter the number you want the factorial: ");
						int a = sc.nextInt();
						int b = 1;
						for (int i = 1; i <= a; i++) {
							b = b * i;
							
						}
						System.out.println("Factorial of the entered number : " + b);
						Thread.sleep(3000);
						break;
					case 3:
						System.out.println("Enter Number : ");
						long number = sc.nextLong();
						if (number == 2) {
							System.out.println("This is Prime Number.");
						}
						else if (number <= 1 || number % 2 == 0) {
							System.out.println("This is not Prime Number");
						}
						else {
							boolean isPrime = true;
							for (long i = 3; i <= Math.sqrt(number); i += 2) {
								if (number % i == 0) {
									isPrime = false;
									break;
								}
							}
							if (isPrime) {
								System.out.println("This is Prime Number.");
							}
							else {
								System.out.println("This is not Prime Number.");
							}
						}
						Thread.sleep(3000);
						break;
					default:
						System.out.println("You pressed different key. You are logging out...");
						Thread.sleep(2000);
						select = 5;
						break;
				}
			}
		}
	}
}