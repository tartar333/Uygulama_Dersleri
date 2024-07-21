package org.example.hafta4.ders3;

import java.util.Scanner;

public class kayit {
	private String kullanici;
	private int kullanicicount;
	private int id;
	private String adi;
	private String soyadi;
	private String mail;
	private int telNo;
	private int sifre;
	private String kullaniciAdi;
	private int tcKimlik;
	private String kayitTarihi;
	private int dogumTarihi;
	
	public kayit(String mail) {
		this.mail = mail;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kayit Olmak Icin Kullanici Adinizi Giriniz:");
		String isim = scanner.nextLine();
	}
	
	public String getKayitTarihi() {
		return kayitTarihi;
	}
	
	public void setKayitTarihi(String kayitTarihi) {
		this.kayitTarihi = kayitTarihi;
	}
}