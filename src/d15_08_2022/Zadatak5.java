package d15_08_2022;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
//	Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//		Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se
//		/ / / / /
//		Napomena: Metoda nista ne vraca.

		Scanner s = new Scanner(System.in);
		
		System.out.print("Unesite N: ");
		int n = s.nextInt();
		
		System.out.print("Unesite karakter: " + " ");
		String karakter = s.next();
		
		karakteri(n, karakter);
	}
	
	public static void karakteri(int n, String karakter) {
		for(int i = 0; i < n; i++) {
			System.out.print(karakter);
		}		
	}
}

