package p25_08_2022;

import java.util.ArrayList;

public class Zadatak1 {

	public static void main(String[] args) {
//		Kreirati klasu Sastojak koja ima:
//			naziv
//			cenu
//			gettere i settere
//			konstruktore
//			metodu za stampanje koja stampa  podatke u formatu:
//			naziv - cena.din
//				
//				Kreirati klasu Pasta koja ima:
//			niz sastojaka
//			metodu za dodavanje sastojka
//			defaultni konstruktor
//			metodu koja racuna cenu paste, tako sto sumira cene svih sastojaka
//			metodu za stampu koja stampa podatke u formatu:
//			Pasta je sa sastojcima:
//			naziv - cena.din
//			naziv - cena.din
//			naziv - cena.din
//			Cena paste je cena.din
//
//			U glavnom programu kreirati objekte i testirati funkcionalnosti 
//
//
//			(ostavite za kraj) metodu za brisanje sastojka. U metodu se salje naziv sastojka koji se brise.


		ArrayList<Sastojak> sastojci = new ArrayList<Sastojak>();
		
		Sastojak prvi = new Sastojak("sir", 120);
		Sastojak drugi = new Sastojak("spagete", 150);
		Sastojak treci = new Sastojak("meso", 180);
		
		
		Pasta bolonjeze = new Pasta();
		
		bolonjeze.dodajSastojak(prvi);
		bolonjeze.dodajSastojak(drugi);	
		bolonjeze.dodajSastojak(treci);
	
		bolonjeze.print();
	}

}
