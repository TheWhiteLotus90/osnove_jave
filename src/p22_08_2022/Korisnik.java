package p22_08_2022;

public class Korisnik {
//	ime
//	prezime
//	gettere i settere za ime i prezime
//	konstuktore koje mislite da su vam potrebni
//	metoda koja stampa u formatu:
//	(ime) (prezime)
	
	private String ime;
	private String prezime;
	
	public Korisnik() {
		
	}
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public Korisnik(String ime, String prezime) {

		this.ime = ime;
		this.prezime = prezime;
	}
	
	public void print() {
		System.out.println("Ime i prezime: " + this.ime + " " + this.prezime);
	}
}
