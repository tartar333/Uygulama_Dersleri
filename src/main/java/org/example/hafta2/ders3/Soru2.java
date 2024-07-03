package org.example.hafta2.ders3;

import java.util.Scanner;

public class Soru2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the month value (1-12) : ");
		int month = sc.nextInt();
		System.out.print("Enter the day value (1-31) : ");
		int day = sc.nextInt();
		String horoscope;
		
		switch (month) {
			case 1:
				if (day <= 21) {
					horoscope = "Capricorn";
				}
				else {
					horoscope = "Aquarius";
				}
				break;
			case 2:
				if (day <= 19) {
					horoscope = "Aquarius";
				}
				else {
					horoscope = "Pisces";
				}
				break;
			case 3:
				if (day <= 21) {
					horoscope = "Pisces";
				}
				else {
					horoscope = "Aries";
				}
				break;
			case 4:
				if (day <= 21) {
					horoscope = "Aries";
				}
				else {
					horoscope = "Taurus";
				}
				break;
			case 5:
				if (day <= 21) {
					horoscope = "Taurus";
				}
				else {
					horoscope = "Gemini";
				}
				break;
			case 6:
				if (day <= 21) {
					horoscope = "Gemini";
				}
				else {
					horoscope = "Capricorn";
				}
				break;
			case 7:
				if (day <= 21) {
					horoscope = "Capricorn";
				}
				else {
					horoscope = "leo";
				}
				break;
			case 8:
				if (day <= 21) {
					horoscope = "Leo";
				}
				else {
					horoscope = "Virgo";
				}
				break;
			case 9:
				if (day <= 21) {
					horoscope = "Virgo";
				}
				else {
					horoscope = "Libra";
				}
				break;
			case 10:
				if (day <= 21) {
					horoscope = "Libra";
				}
				else {
					horoscope = "Scorpio";
				}
				break;
			case 11:
				if (day <= 21) {
					horoscope = "Scorpio";
				}
				else {
					horoscope = "Sagittarius";
				}
				break;
			case 12:
				if (day <= 21) {
					horoscope = "Sagittarius";
				}
				else {
					horoscope = "Capricorn";
				}
				break;
			default:
				horoscope = "Invalid Month Value";
				break;
		}
		System.out.println("Your Horoscope : " + horoscope);
	}
}