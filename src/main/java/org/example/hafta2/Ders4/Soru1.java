package org.example.hafta2.Ders4;

import java.util.Scanner;

public class Soru1 {      /*
 1- Dışarıdan bir string girdisi alalım.
 Bu stringin her bir harfini, bulunduğu
 index ile birlikte alt alta yazdıracağım.
 */
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.print("Bir kelime girin : ");
		String a = sc.nextLine();
		
		for(int i = 0; i<a.length(); i++){
			System.out.print(" "+i+".index = "+ a.charAt(i));
		}
		
	
	
	}
}