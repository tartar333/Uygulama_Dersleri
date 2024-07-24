package org.example.hafta5.ders1.Odev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KayitMenusu {
	static class Kullanici {
		String eposta;
		String tcKimlik;
		String kullaniciAdi;
		String sifre;
		String guvenlikSorusu;
		
		Kullanici(String eposta, String tcKimlik, String kullaniciAdi, String sifre, String guvenlikSorusu) {
			this.eposta = eposta;
			this.tcKimlik = tcKimlik;
			this.kullaniciAdi = kullaniciAdi;
			this.sifre = sifre;
			this.guvenlikSorusu = guvenlikSorusu;
		}
	}
	
	private static List<Kullanici> kullanicilar = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("1. Kayıt Ol");
			System.out.println("2. Giriş Yap");
			System.out.println("3. Şifremi Unuttum");
			System.out.println("4. Çıkış");
			System.out.print("Seçiminiz: ");
			int secim = sc.nextInt();
			sc.nextLine();
			
			switch (secim) {
				case 1:
					kayitOl(sc);
					break;
				case 2:
					girisYap(sc);
					break;
				case 3:
					sifremiUnuttum(sc);
					break;
				case 4:
					System.out.println("Çıkış yapılıyor...");
					sc.close();
					return;
				default:
					System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
			}
		}
	}
	
	// Kullanıcı kayıt işlemii
	private static void kayitOl(Scanner sc) {
		String eposta;
		String tc;
		String kullaniciAdi;
		String sifre;
		
		while (true) {
			System.out.print("E-posta: ");
			eposta = sc.nextLine();
			if (!gecerliEposta(eposta)) {
				System.out.println("Geçersiz e-posta. Lütfen geçerli bir e-posta adresi girin.");
				continue;
			}
			if (epostaVarMi(eposta)) {
				System.out.println("Girdiğiniz e-posta kullanılmaktadır.");
				continue;
			}
			
			while (true) {
				System.out.print("TC Kimlik: ");
				tc = sc.nextLine();
				if (tc.length() != 11) {
					System.out.println("TC Kimlik Numarası 11 haneli olmalıdır. Lütfen tekrar girin.");
					continue;
				}
				if (tcVarMi(tc)) {
					System.out.println("Girdiğiniz TC Kimlik başkasına aittir.");
					continue;
				}
				break;
			}
			
			System.out.print("Kullanıcı Adı: ");
			kullaniciAdi = sc.nextLine();
			if (kullaniciAdiVarMi(kullaniciAdi)) {
				System.out.println("Girdiğiniz kullanıcı adı kullanılmaktadır.");
				continue;
			}
			
			System.out.print("Şifre: ");
			sifre = sc.nextLine();
			
			// Güvenlik sorusunu kaydet
			System.out.print("Güvenlik Sorusu: En sevdiğiniz öğretmenin adı nedir? ");
			String guvenlik = sc.nextLine();
			
			// Kullanıcı bilgilerini kaydet
			kullanicilar.add(new Kullanici(eposta, tc, kullaniciAdi, sifre, guvenlik));
			System.out.println("Kayıt başarılı!");
			break;
		}
	}
	
	// Kullanıcı giriş işlemi
	private static void girisYap(Scanner tarayici) {
		System.out.print("Kullanıcı Adı: ");
		String kullaniciAdi = tarayici.nextLine();
		
		System.out.print("Şifre: ");
		String sifre = tarayici.nextLine();
		
		if (gecerliKullanici(kullaniciAdi, sifre)) {
			System.out.println("Başarıyla Giriş Yaptınız");
			kullaniciMenusu(tarayici, kullaniciAdi);
		} else {
			System.out.println("Kullanıcı adı veya şifre yanlış. Lütfen tekrar deneyin.");
			System.out.print("Şifrenizi sıfırlamak ister misiniz? (E/H): ");
			String cevap = tarayici.nextLine();
			if (cevap.equalsIgnoreCase("E")) {
				if (!sifremiUnuttum(tarayici)) {
					System.out.println("Doğrulama bilgileri hatalı. Ana menüye dönülüyor...");
				}
			} else {
				System.out.println("Ana menüye dönülüyor...");
			}
		}
	}
	
	// Kullanıcı menüsü
	private static void kullaniciMenusu(Scanner tarayici, String kullaniciAdi) {
		while (true) {
			System.out.println("1. Şifre Değiştir");
			System.out.println("2. Çıkış Yap");
			System.out.print("Seçiminiz: ");
			int secim = tarayici.nextInt();
			tarayici.nextLine();
			
			switch (secim) {
				case 1:
					sifreDegistir(tarayici, kullaniciAdi);
					break;
				case 2:
					System.out.println("Anamenüye Dönülüyor...");
					return;
				default:
					System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
			}
		}
	}
	
	// Şifre değiştirme işlemi
	private static void sifreDegistir(Scanner tarayici, String kullaniciAdi) {
		System.out.print("Yeni Şifre: ");
		String yeniSifre = tarayici.nextLine();
		
		if (sifreSifirla(kullaniciAdi, yeniSifre)) {
			System.out.println("Şifreniz başarıyla değiştirildi.");
		} else {
			System.out.println("Şifre değiştirme işlemi başarısız.");
		}
	}
	
	// Şifremi unuttum işlemi
	private static boolean sifremiUnuttum(Scanner tarayici) {
		System.out.print("Kullanıcı Adı: ");
		String kullaniciAdi = tarayici.nextLine();
		
		if (!kullaniciAdiVarMi(kullaniciAdi)) {
			System.out.println("Kullanıcı adı bulunamadı.");
			return false;
		}
		
		System.out.print("Doğrulama için e-posta: ");
		String eposta = tarayici.nextLine();
		
		System.out.print("Doğrulama için TC Kimlik: ");
		String tc = tarayici.nextLine();
		
		System.out.print("Güvenlik Sorusu: En sevdiğiniz öğretmenin adı nedir? ");
		String guvenlik = tarayici.nextLine();
		
		if (!kullaniciBilgileriniDogrula(kullaniciAdi, eposta, tc, guvenlik)) {
			System.out.println("Doğrulama bilgileri hatalı.");
			return false;
		}
		
		System.out.print("Yeni Şifre: ");
		String yeniSifre = tarayici.nextLine();
		
		if (sifreSifirla(kullaniciAdi, yeniSifre)) {
			System.out.println("Şifreniz başarıyla değiştirildi.");
			return true;
		} else {
			System.out.println("Şifre değiştirme işlemi başarısız.");
			return false;
		}
	}
	
	// E-posta var mı kontrolü
	private static boolean epostaVarMi(String eposta) {
		for (Kullanici kullanici : kullanicilar) {
			if (kullanici.eposta.equals(eposta)) {
				return true;
			}
		}
		return false;
	}
	
	// TC Kimlik var mı kontrolü
	private static boolean tcVarMi(String tc) {
		for (Kullanici kullanici : kullanicilar) {
			if (kullanici.tcKimlik.equals(tc)) {
				return true;
			}
		}
		return false;
	}
	
	// Kullanıcı adı var mı kontrolü
	private static boolean kullaniciAdiVarMi(String kullaniciAdi) {
		for (Kullanici kullanici : kullanicilar) {
			if (kullanici.kullaniciAdi.equals(kullaniciAdi)) {
				return true;
			}
		}
		return false;
	}
	
	// Kullanıcı adı ve şifreyi doğrulayan metot
	private static boolean gecerliKullanici(String kullaniciAdi, String sifre) {
		for (Kullanici kullanici : kullanicilar) {
			if (kullanici.kullaniciAdi.equals(kullaniciAdi) &&
					kullanici.sifre.equals(sifre)) {
				return true;
			}
		}
		return false;
	}
	
	// Kullanıcı bilgilerini doğrulayan metot
	private static boolean kullaniciBilgileriniDogrula(String kullaniciAdi, String eposta, String tc, String guvenlik) {
		for (Kullanici kullanici : kullanicilar) {
			if (kullanici.kullaniciAdi.equals(kullaniciAdi) &&
					kullanici.eposta.equals(eposta) &&
					kullanici.tcKimlik.equals(tc) &&
					kullanici.guvenlikSorusu.equals(guvenlik)) {
				return true;
			}
		}
		return false;
	}
	
	// Şifre sıfırlama metodu
	private static boolean sifreSifirla(String kullaniciAdi, String yeniSifre) {
		for (Kullanici kullanici : kullanicilar) {
			if (kullanici.kullaniciAdi.equals(kullaniciAdi)) {
				kullanici.sifre = yeniSifre;
				return true;
			}
		}
		return false;
	}
	
	// E-posta geçerlilik kontrolü
	private static boolean gecerliEposta(String eposta) {
		return eposta.contains("@") && eposta.contains(".");
	}
}