package p22_08_2022;

public class Zadatak3 {

	public static void main(String[] args) {
//	Kreirati klasu Proizvod koja ima
//		Naziv proizvoda
//		kupca/musteriju
//		cenu izrade proizvoda
//		gettere i settere
//		konstruktore
//		Metodu za racunanje cene proizvoda, koja racuna cenu proizvoda po formuli:
//		cena izrade * 1.9 * (100 - popust na clansku karticu) / 100
//		Metodu za stampanje proizvoda u formatu:
//		naziv proizvoda - cena
//		ime i prezime - broj kartice

		ClanskaKarta karta = new ClanskaKarta(10, "255-4164");
		Kupac Nevena = new Kupac("Nevena Grujic", karta);
		Proizvod knjiga = new Proizvod("knjiga", Nevena, 400 );
	
		knjiga.print();
	}

}
