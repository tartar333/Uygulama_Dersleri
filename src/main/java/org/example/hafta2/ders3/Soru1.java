package org.example.hafta2.ders3;

import org.example.Main;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Soru1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		while(true){
			System.out.print("Enter a number between 1-7 : ");
			number = sc.nextInt();
			switch (number){
				case 1:
					System.out.println("Monday");
					break;
				case 2:
					System.out.println("Tuesday");
					break;
				case 3:
					System.out.println("Wednesday");
					break;
				case 4:
					System.out.println("Thursday");
					break;
				case 5:
					System.out.println("Friday");
					break;
				case 6:
					System.out.println("Saturday");
					break;
				case 7:
					System.out.println("Sunday");
					break;
				default:
					System.out.println("Incorrect value entered.");
					break;
			}
		}
		
		
		
	}
}