package p23_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
//	Kreirati klasu Sastojak koja ima:
//		naziv sastojka
//		cenu 
//		gettere i settere 
//		konstuktore
//		--U glavnom programu kreirati 3 sastojka.
//		 U glavnom programu kreirati niz sastojaka ucitavajuci ih od korisnika.
//		 Ucitavaju se N sastojaka i na kraju odstampati niz. Koristeci ArrayList-e

		ArrayList<Sastojak> sastojci = new ArrayList<Sastojak>();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Unesite broj sastojaka: ");
		int n = s.nextInt();
		
		Sastojak mleko = new Sastojak("mleko", 180);
		Sastojak vanila = new Sastojak("vanila", 150);
		Sastojak cokolada = new Sastojak("cokolada", 200);
		
		sastojci.add(mleko);
		sastojci.add(vanila);
		sastojci.add(cokolada);
		
		for(int i = 0; i < n; i++) {
			System.out.println("Unesite sastojak: ");
			String naziv = s.next();
			System.out.println("Unesite cenu: ");
			int cena = s.nextInt();
			
			Sastojak sastojak = new Sastojak(naziv, cena);
			sastojci.add(sastojak);
		}
	}

}
