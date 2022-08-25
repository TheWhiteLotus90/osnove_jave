package d22_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//	Kreirati klasu Autor koja ima
//		-ime i prezime
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu:
//		(ime autora) (prezime autora)
//
//	Kreirati klasu Knjiga koji ima:
//		-ISBN
//		-naziv
//		-godina izdanja
//		-autor
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//		(ISBN)
//		(naziv) - (godina izdanja)
//		autor: (ime autora) (prezime autora) 
//
//	U glavnom programu napraviti vise autora sa vise knjiga.

		Autor prvi = new Autor("Donato Karizi");
		Knjiga prva = new Knjiga(156463162, "Noc mi te uzima", 2020, prvi);
		
		Autor drugi = new Autor("Vladeta Jerotic");
		Knjiga druga = new Knjiga(158963278, "120 pitanja i 120 odgovora", 2017, drugi);
		
		Autor treci = new Autor("Ricard Ozman");
		Knjiga treca = new Knjiga(156389452, "Klub ubistava cetvrtkom",2021, treci);
		
		prva.print();
		System.out.println();
		
		druga.print();
		System.out.println();
		
		treca.print();
	}

}
