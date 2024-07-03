package org.example.hafta2.ders3;

import java.util.Scanner;

public class Soru3 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Number Value : ");
		int temp = sc.nextInt();
		int number = temp;
		int c=0;
		for(int i =1; i<=temp/2; i++) {
			if (number % i == 0) {
				c = i + c;
			}
			
		}
		if(number == c){
			System.out.println(number+" is a Perfect Number");
		}
		else{
			System.out.println(number+"is not Perfect Number");
		}
	}
}