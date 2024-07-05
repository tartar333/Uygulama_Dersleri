package org.example.hafta2.Ders4;

public class String_Methods {
	public static void main(String[] args) {
		String value =" Merhaba Dunya ";
		String value2 = "Merhaba Dunya";
		System.out.println(value.charAt(2)); // 2. Index'teki karakteri gösterir. 0,1,2
		System.out.println(value.trim()); //whitespace'leri siler.
		System.out.println(value.trim().charAt(2));//whitespace'leri siler ardından 2. Index'i getirir.
		System.out.println(value2.length()); // String uzunluğunu verir.
		System.out.println(value2.indexOf('a')); // a harfinin ilk görüldüğü index'i verir.
		System.out.println(value2.lastIndexOf( 'a')); // a harfinin görüldüğü son index'i verir.
		System.out.println(value2.substring(5)); //5. index ve sonrasını getirir.
		System.out.println(value2.substring(0,5)); // 0. index'den 5. index'e kadar olan kısmı getirir. 5 dahil değil.
		System.out.println(value.equals(value2)); // false
		System.out.println(value == " Merhaba Dunya "); // true
		System.out.println(value.trim() == value2); // false, referans degerine bakarak okuduğu için 2 degiskenin
		// ayrı adreste olduklarını görüyor.
		System.out.println(value.trim().equals(value2)); // true, equals ile ic, ham(raw) deger karşılaştırılmasına
		// sokuluyor o yüzden true dönüyor.
		
		
		
		
		
		
		
	}
}