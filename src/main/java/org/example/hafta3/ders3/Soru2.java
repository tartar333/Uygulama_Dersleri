package org.example.hafta3.ders3;

public class Soru2 {
	public static void main(String[] args) {
		int[][] matris = {{56, 23, 678, 231, 5}, {234, 21, 78, 26, 6}, {654, 33, 32, 67, 2}, {189, 35, 56, 89, 8}};
		int size = matris.length * matris[0].length;
		int[] tekboyut = new int[size];
		
		hesap(matris, tekboyut);
	}
	
	public static void hesap(int a[][], int b[]) {
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				b[index++] = a[i][j];
			}
		}
		for(int i=0; b.length>i; i++){
			System.out.print(b[i]+",");
		}
	}
}