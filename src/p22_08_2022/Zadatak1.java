package p22_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Kreirati klasu Film koja ima:
//			naziv filma
//			iz koje godine je film 
//			reziser
//			konstruktore, gettere i settere koji su potrebni
//			metodu print koja stampa podatke u formatu
//			naziv filma, godina
//			Rezirao je: Ime prezime, starost.god
//
//
//			Kreirati klasu Reziser koja ima:
//			ime i prezime rezisera
//			startost
//			konstruktore, gettere i settere koji su potrebni
//			metodu print koja stampa podatke u formatu
//			ime prezime, starost.god
//
//			U main metodi, kreirati jedan film i jednog rezisera i pozvati svaku od metoda
			
//			
			
			Reziser reziser = new Reziser("Neko N", 60);
			Film film = new Film("Deep water", 2022, reziser); // treci parametar je atribut novi
			
//			reziser.print();
//			film.setReziser(reziser);
			film.print();
			
	}

}
