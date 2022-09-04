package p19_08_2022;

public class Korisnik {
	private String ime;
	private String prezime;
	private String email;
	
	public Korisnik() { // defaultni konstruktor jer u zagradi nema parametra, moze da imamo vise konstruktora za jednu klasu
//		1. pravilo: nemamo void, povratni tip, konstruktor vraca samo adresu do tog objekta, nema int, samo public
//		2. pravilo: konstruktor mora da ima isti naziv kao klasa!
		
		 // u telu defaultnog konstruktora nista ne stavljamo, ne rade se petlje i sl
	}
	// jedini nacin da se pozove konstruktor je da se kreira naredba za pravljenje objekta, jedino mesto
	
	
	// KONSTRUKOR KOJI PRIMA PARAMETRE:
	
	public Korisnik(String i, String p, String m) {
			this.ime = i;  // uradili smo dodelu onog sto je pre radjeno u mainu
			this.prezime = p;
			this.email = m;
	}
	public Korisnik(String ime) {
		this.ime = ime; // on setuje samo ime, taj parametar ima, druge atribute ima, ali jedan ispisuje u main
	}
	
 // public - MODIFIKATOR

	public void stamapaj() {
		System.out.println(this.ime); // - kako dolazimo do vrednosti atributa kad je private modifikator, preko metode
	}

	public void setIme(String ime) { // setujemo ime iz private
		this.ime = ime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	public String getIme() { // citamo vrednost iz private
		return this.ime;
	}

	public String getPrezime() {
		return this.prezime;
	}

//public void setNazivAtributa(TipAtributa nazivAtributa) {
//	this.nazivAtributa = nazivAtributa;
}
//