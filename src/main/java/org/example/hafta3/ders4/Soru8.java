package org.example.hafta3.ders4;

public class Soru8 {
	public static void main(String[] args) {
		Metodlar metodlar =new Metodlar();
		String metin = "Merhaba! Bu bir Örnek Metin.";
		int kucukHarfSayisi = metodlar.kucukharfsay(metin);
		System.out.println("Metin içindeki küçük harf sayısı: " + kucukHarfSayisi);
		int buyukHarfSayisi = metodlar.buyukharfsay(metin);
		System.out.println(" buyukHarf sayısı: " + buyukHarfSayisi);
	}
}