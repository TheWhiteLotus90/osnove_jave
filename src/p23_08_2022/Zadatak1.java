package p23_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Zadatak
//
//			Kreirati klasu Korisnik koja ima:
//		ime i prezime 
//		tip licence (basic/pro/premium)
//		konstruktore. Po difoltu korisnik ima basic licencu.
//		gettere i settere za sve atribute, sem za tip licence koja ne moze da se menja
//		metodu pretplati se koja postavlja licencu u zavisnosi od uplacene sume:
//		ako je uplata 100, postavlja licencu na “pro”
//		ako je uplata 150, postavlja licencu na “premium”
//		Metoda kao parametar prima vrednost uplate $100 ili $150
//		metodu ponisti pretplatu koja postavlja licencu na basic
//		metodu koja vraca maksimalnu duzinu trajanja video poziva u zavisnosti od licence
//		ako je basic, vraca 40min
//		ako je pro, vraca 240min
//		ako je  premium, vraca 1440min
//		metodu za stampu koja stampa u formatu:
//		ime i prezime

//			Kreirati klasu ZoomCall koja ima:
//		link za poziv
//		password
//		korisnika koji je host
//		korisnika koji je guest
//		gettere za sve atribute
//		setter samo za guest-a
//		metodu pokreni poziv koja stampa podatke u formatu:
//				Zoom Call: url
//				Password: password
//				Host: ime i prezime
//				Guest: ime i prezime
//				Maksimalno trajanje poziva je (broj minuta)min
//				
//				Maksimalno trajanje poziva se cita od korisnika koji je host!
//
//			U glavnom programu kreirati objekte definisanih klasa i testirati rad definisanih funkcija 
//
		Korisnik Nena = new Korisnik();
		
		Nena.setPunoIme("Nevena Grujic");
		Nena.pretplatiSe(100);
		
		System.out.println(Nena.getTip());
		System.out.println(Nena.maxDuzina());
		
//		Korisnik m = new Korisnik("Pera Peric");
//		m.pretplatiSe(150);
//		
//		System.out.println(m.getTip());
		
		
		ZoomCall z = new ZoomCall("fjdlajfls", "4553saf", Nena);
//		z.setKorisnikGuest(m);
//		z.pokreniPoziv();
	}

}
