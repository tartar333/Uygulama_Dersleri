package org.example.hafta2.ders2;

public class Soru5 {
	public static void main(String[] args) {
		int ctoplam=0;
		int ttoplam=0;
		double oran;
		for(int i=1; i<101; i++){
			if(i%2==0){
				ctoplam+=i;
			}
			else{
				ttoplam+=i;
			}
		}
	    oran=(double)ctoplam/ttoplam;
		System.out.println("1 den 100'e kadar olan sayilarin icindeki Cift sayilarin toplaminin, Tek sayilara orani : "+oran);
	}
}