package p16_08_2022;

public class Predavanje1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Korisnik k = new Korisnik();
		k.ime = "Milan";
		k.godine = 30;		// objekat klase korisnik, on s pravi u memoriji
		
		System.out.println(k.ime);
		
		// pravimo novog korisnika
		
		Korisnik r =  new Korisnik();
		//dodelimo vrednosti kao kod prvog
		
		// objekti su instance klase, a klasa definise kako treba da izgleda objekat, koje info ima
	}

}
