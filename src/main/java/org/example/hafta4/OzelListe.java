package org.example.hafta4;

import java.util.Scanner;

public class OzelListe {
	// Sayı dizisi
	private int[] sayiDizisi;
	
	// Yapıcı (constructor) - diziyi başlatır
	public OzelListe(int[] sayilar) {
		this.sayiDizisi = sayilar;
	}
	
	// Diziyi döndüren bir metot
	public int[] getSayiDizisi() {
		return this.sayiDizisi;
	}
	
	// Diziyi yazdırmak için bir metot
	public void yazdir() {
		for (int sayi : sayiDizisi) {
			System.out.print(sayi + " ");
		}
		System.out.println();
	}
	
	// Dizinin elemanlarını toplamak için bir metot
	public int toplam() {
		int toplam = 0;
		for (int sayi : sayiDizisi) {
			toplam += sayi;
		}
		return toplam;
	}
	
	// Yeni eleman ekleyen metot
	public void add(int yeniSayi) {
		// Yeni bir dizi oluştur
		int[] yeniDizi = new int[sayiDizisi.length + 1];
		
		// Eski dizinin elemanlarını yeni diziye kopyala
		for (int i = 0; i < sayiDizisi.length; i++) {
			yeniDizi[i] = sayiDizisi[i];
		}
		
		// Yeni elemanı dizinin sonuna ekle
		yeniDizi[yeniDizi.length - 1] = yeniSayi;
		
		// sayiDizisi'ni yeni dizi ile güncelle
		this.sayiDizisi = yeniDizi;
	}
	
	// Eleman silen metot
	public void remove(int index) {
		// Eğer index geçersizse, hata ver
		if (index < 0 || index >= sayiDizisi.length) {
			throw new IndexOutOfBoundsException("Geçersiz indeks: " + index);
		}
		
		// Yeni bir dizi oluştur
		int[] yeniDizi = new int[sayiDizisi.length - 1];
		
		// Eski dizinin elemanlarını yeni diziye kopyala
		for (int i = 0, j = 0; i < sayiDizisi.length; i++) {
			if (i != index) {
				yeniDizi[j++] = sayiDizisi[i];
			}
		}
		
		// sayiDizisi'ni yeni dizi ile güncelle
		this.sayiDizisi = yeniDizi;
	}
	
	// Listeyi { , , , } formatında yazdıran metot
	public void list() {
		System.out.print("{ ");
		for (int i = 0; i < sayiDizisi.length; i++) {
			System.out.print(sayiDizisi[i]);
			if (i < sayiDizisi.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println(" }");
	}
	
	// Dışarıdan dizi alıp elemanlarını ekleyen metot
	public void addAll(int[] yeniSayilar) {
		// Yeni dizi uzunluğu hesapla
		int[] yeniDizi = new int[sayiDizisi.length + yeniSayilar.length];
		
		// Eski dizinin elemanlarını yeni diziye kopyala
		for (int i = 0; i < sayiDizisi.length; i++) {
			yeniDizi[i] = sayiDizisi[i];
		}
		
		// Yeni elemanları dizinin sonuna ekle
		for (int i = 0; i < yeniSayilar.length; i++) {
			yeniDizi[sayiDizisi.length + i] = yeniSayilar[i];
		}
		
		// sayiDizisi'ni yeni dizi ile güncelle
		this.sayiDizisi = yeniDizi;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Kullanıcıdan dizi uzunluğunu al
		System.out.print("Dizi uzunluğunu girin: ");
		int uzunluk = scanner.nextInt();
		
		// Kullanıcıdan dizi elemanlarını al
		int[] sayilar = new int[uzunluk];
		for (int i = 0; i < uzunluk; i++) {
			System.out.print((i + 1) + ". sayıyı girin: ");
			sayilar[i] = scanner.nextInt();
		}
		
		// OzelListe nesnesi oluştur
		OzelListe ozelListe = new OzelListe(sayilar);
		
		// Diziyi yazdır
		System.out.print("Başlangıç dizisi: ");
		ozelListe.list();
		
		// Kullanıcıdan eklemek istediği elemanları al
		System.out.print("Eklemek istediğiniz eleman sayısını girin: ");
		int ekleSayisi = scanner.nextInt();
		for (int i = 0; i < ekleSayisi; i++) {
			System.out.print("Eklemek istediğiniz " + (i + 1) + ". sayıyı girin: ");
			int yeniSayi = scanner.nextInt();
			ozelListe.add(yeniSayi);
			
			// Diziyi her eklemeden sonra yazdır
			System.out.print("Güncel dizi: ");
			ozelListe.list();
		}
		
		// Kullanıcıdan eklemek istediği yeni diziyi al
		System.out.print("Eklemek istediğiniz dizinin uzunluğunu girin: ");
		int yeniDiziUzunluk = scanner.nextInt();
		int[] yeniDizi = new int[yeniDiziUzunluk];
		for (int i = 0; i < yeniDiziUzunluk; i++) {
			System.out.print("Yeni dizinin " + (i + 1) + ". elemanını girin: ");
			yeniDizi[i] = scanner.nextInt();
		}
		ozelListe.addAll(yeniDizi);
		
		// Güncellenmiş diziyi yazdır
		System.out.print("Yeni dizi eklendikten sonra dizi: ");
		ozelListe.list();
		
		// Bir eleman sil
		System.out.print("Silmek istediğiniz indeks numarasını girin: ");
		int silinecekIndex = scanner.nextInt();
		ozelListe.remove(silinecekIndex);
		
		// Diziyi tekrar yazdır
		System.out.print("Son haliyle dizi: ");
		ozelListe.list();
		
		// Dizinin toplamını yazdır
		System.out.println("Toplam: " + ozelListe.toplam());
		
		scanner.close();
	}
}