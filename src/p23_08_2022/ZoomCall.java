package p23_08_2022;

public class ZoomCall {
//	link za poziv
//	password
//	korisnika koji je host
//	korisnika koji je guest
//	gettere za sve atribute
//	setter samo za guest-a
//	metodu pokreni poziv koja stampa podatke u formatu:
//			Zoom Call: url
//			Password: password
//			Host: ime i prezime
//			Guest: ime i prezime
//			Maksimalno trajanje poziva je (broj minuta)min
//			
//			Maksimalno trajanje poziva se cita od korisnika koji je host!
	
	private String link;
	private String pass;
	private Korisnik Host; // !
	private Korisnik Guest; // !
	
	
//	preko konstruktora setujemo vrednosti za ova 3 atributa
	public ZoomCall(String link, String pass, Korisnik Host) {
	this.link = link;
	this.pass = pass;
	this.Host = Host;
	}
	
	public String getLink() {
		return link;
	}

	public String getPassword() {
		return pass;
	}
	public Korisnik getKorisnikHost() {
		return Host;
	}
	public Korisnik getKorisnikGuest() {
		return Guest;
	}
	public void setKorisnikGuest(Korisnik Guest) {
		this.Guest = Guest;
	}
	public void pokreniPoziv() {
		System.out.println("Zoom call: " + this.link);
		System.out.println("Password: " + this.pass);
		System.out.println("Host: " + this.Host);
		System.out.println("Guest: " + this.Guest);
	}

	
}
