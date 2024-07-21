package org.example.hafta3.ders4;


import java.util.Arrays;
import java.util.function.Function;



public class Metodlar {
	double ortalamaHesapla(int[] array) {
		double toplam = 0;
		for (int i = 0; i < array.length; i++) {
			toplam += array[i];
		}
		return toplam / array.length;
	}
	
	boolean tekMi(int tamSayi) {
		
		return tamSayi % 2 == 1;
	}
	
	public static void sirala(int[] array) {
		int n = array.length;
		for (int i = 1; i < n; ++i) {
			int key = array[i];
			int j = i - 1;
			
			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;
		}
		System.out.println(java.util.Arrays.toString(array));
	}
	
	int[] sirala2(int[] dizii) {
		Arrays.sort(dizii);
		return dizii;
	}
	
	public void usAl(int taban, int us) {
		int total = 1;
		for (int j = 0; j < us; j++) {
			total *= taban;
		}
		System.out.println(total);
	}
	
	public String[] metindekiKelimeleriBul(String metin) {
		return metin.split(" ");
	}
	
	public String kelimeTersiBul(String[] kelimeler) {
		StringBuilder sb = new StringBuilder();
		for (String kelime : kelimeler) {
			StringBuilder tersKelime = new StringBuilder(kelime).reverse().append(" ");
			sb.append(tersKelime);
		}
		
		return sb.toString().trim();
	}
	
	public boolean asalMi(long number) {
		boolean isPrime;
		if (number == 2) {
			isPrime = true;
		}
		else if (number <= 1 || number % 2 == 0) {
			isPrime = false;
		}
		else {
			isPrime = true;
			for (long i = 3; i <= Math.sqrt(number); i += 2) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		return isPrime;
	}
	
	public int[] enBuyukNsayi(int[] sayilar, int n) {
		Arrays.sort(sayilar);
		int[] enBuyuksayilar = new int[n];
		for (int i = 0; i < n; i++) {
			enBuyuksayilar[i] = sayilar[sayilar.length - 1 - i];
		}
		return enBuyuksayilar;
	}
	
	public int kucukharfsay(String metin) {
		int sayac = 0;
		
		for (int i = 0; i < metin.length(); i++) {
			char karakter = metin.charAt(i);
			if (Character.isLowerCase(karakter)) {
				sayac++;
			}
		}
		
		return sayac;
	}
	
	public int buyukharfsay(String metin) {
		int sayac = 0;
		
		for (int i = 0; i < metin.length(); i++) {
			char karakter = metin.charAt(i);
			if (Character.isUpperCase(karakter)) {
				sayac++;
			}
		}
		
		return sayac;
	}
	
	public int topla(int a, int b) {
		return a + b;
	}
	
	public int topla(int a, int b, int c) {
		return a + b + c;
	}
	public static String transformTurkishLetters(String word){
		String[] englishChars = { "I", "i", "s", "S", "c", "C", "g", "G", "u", "U", "o", "O" };
		String[] turkishChars = { "İ", "ı", "ş", "Ş", "ç", "Ç", "ğ", "Ğ", "ü", "Ü", "ö", "Ö" };
		
		for (int i = 0; i<turkishChars.length;i++){
			System.out.println("Tükçe: " + turkishChars[i] );
			System.out.println("İngilizce: " + englishChars[i] );
			
			word = word.replace(turkishChars[i],englishChars[i]);
		}
		return word;
	}
	public int diziFark(int[] array) {
		int minFark = Integer.MAX_VALUE;
		int fark;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				fark = Math.abs(array[i] - array[j]);
				if (fark < minFark) {
					minFark = fark;
				}
			}
		}
		
		return minFark;
	}
}