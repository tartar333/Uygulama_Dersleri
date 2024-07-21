package org.example.hafta3.ders1;

import java.util.Scanner;

public class Soru1 {
	/*1- Dışarıdan bir kelime ve bir harf girilsin.
	Eğer kelimemizde o harf varsa kaç tane olduğunu ve index numaralarını yazdırın.
	 Eğer harf içermiyorsa "aradığınız harf yok" gibi bir çıktı verin.
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int b=0;
		while(b<1){
			System.out.println("1-)Kelimede kaç tane aradiginiz harf var.\n" +
					                   "2-)Harf degistirmek icin.\n" +
					                   "3-)Kelimeyi ters cevir ve palindrom mu ?\n" +
					                   "4-).. \n 5-) Cikmak icin farkli bir tusa basin.");
			System.out.print("Secim Yapiniz.");
			int a = scanner.nextInt();
			switch(a){
				case 1:
					System.out.print("Lutfen bir kelime giriniz : ");
					String kelime = scanner.nextLine();
					String harfler = scanner.nextLine();
					char harf = harfler.charAt(0);
					int sayac = 0;
					for (int i = 0; i < kelime.length(); i++) {
						if (kelime.charAt(i) == harf) {
							sayac++;
							System.out.println(i+".index ");
						}
					}
					
					if (sayac > 0) {
						System.out.println("Girdiginiz Kelimede " + sayac + " adet 'a' harfi vardir.");
						
					}
					else {
						System.out.println("Aradiginiz harf yok.");
					}
					break;
				case 2:
					
					break;
				case 3:
					
					break;
				case 4:
					
					break;
				case 5:
					
					break;
				
				default:
				
			}
		}

	}
}