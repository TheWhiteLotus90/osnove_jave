package d25_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {

		Student Nena = new Student(4444, "Nevena Grujic", "Osnovne");
		
		Ispit Informatika = new Ispit("Informatika", 9, "Milan");
		Ispit Ekonomija = new Ispit("Ekonomija", 7, "Pera");
		Ispit Bankarstvo = new Ispit("Bankarstvo", 5, "Zika");
		Ispit Pravo = new Ispit("Pravo", 6, "Milan");
		Ispit MEO = new Ispit("MEO", 8, "Pera");
		
		Nena.dodajIspit(MEO);
		Nena.dodajIspit(Ekonomija);
		Nena.dodajIspit(Pravo);
		Nena.dodajIspit(Informatika);
		Nena.dodajIspit(Bankarstvo);
		
		Nena.stampaj();
	

	}

}
