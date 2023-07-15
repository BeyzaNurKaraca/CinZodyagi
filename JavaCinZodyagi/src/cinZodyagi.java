import java.util.Scanner;

public class cinZodyagi {
	
public static void main(String[] args) {
/*
 *Çin Zodyağı nasıl hesaplanır?

Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

Doğum Tarihi %12 = 0 ➜ Maymun

Doğum Tarihi %12 = 1 ➜ Horoz

Doğum Tarihi %12 = 2 ➜ Köpek

Doğum Tarihi %12 = 3 ➜ Domuz

Doğum Tarihi %12 = 4 ➜ Fare

Doğum Tarihi %12 = 5 ➜ Öküz

Doğum Tarihi %12 = 6 ➜ Kaplan

Doğum Tarihi %12 = 7 ➜ Tavşan

Doğum Tarihi %12 = 8 ➜ Ejderha

Doğum Tarihi %12 = 9 ➜ Yılan

Doğum Tarihi %12 = 10 ➜ At

Doğum Tarihi %12 = 11 ➜ Koyun
 * 
 * 
 * */	
	
	int dogumYili;
	Scanner input=new Scanner(System.in);
	System.out.print("Dogum yilinizi giriniz: ");
	dogumYili=input.nextInt();
	
	if (dogumYili%12==0) {
		System.out.print("Cin zodyagi burcunuz: Maymun");
	}
	else if (dogumYili%12==1) {
		System.out.print("Cin zodyagi burcunuz: Horoz");
	}
	else if (dogumYili%12==2) {
		System.out.print("Cin zodyagi burcunuz: Kopek");
	}
	else if (dogumYili%12==3) {
		System.out.print("Cin zodyagi burcunuz: Domuz");
	}
	else if (dogumYili%12==4) {
		System.out.print("Cin zodyagi burcunuz: Fare");
	}
	else if (dogumYili%12==5) {
		System.out.print("Cin zodyagi burcunuz: Okuz");
	}
	else if (dogumYili%12==6) {
		System.out.print("Cin zodyagi burcunuz: Kaplan");
	}
	else if (dogumYili%12==7) {
		System.out.print("Cin zodyagi burcunuz: Tavsan");
	}
	else if (dogumYili%12==8) {
		System.out.print("Cin zodyagi burcunuz: Ejderha");
	}
	else if (dogumYili%12==9) {
		System.out.print("Cin zodyagi burcunuz: Yilan");
	}
	else if (dogumYili%12==10) {
		System.out.print("Cin zodyagi burcunuz: At");
	}
	else if (dogumYili%12==11) {
		System.out.print("Cin zodyagi burcunuz: Koyun");
	}
}

}
