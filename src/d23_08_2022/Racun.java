package d23_08_2022;

public class Racun {
//	broj racuna (npr: 170-289328923-23)
//	ime i prezime osobe
//	trenutno stanje na racunu (npr: 100, 1220)
//	gettere i setter za sve atribute, sem settera za stanje na racunu
//	metodu koja menja stanje na racunu za prosledjenu vrednost (stanje na racunu ne moze da bude manje od nule)
//	metodu koja stampa podatke o racunu u formatu:
//	Ime i prezime  -  broj racuna
//	stanje na racunu je (trenutno stanje) rsd.
	
	private String broj;
	private String punoIme;
	private int stanje;
	
	public Racun(String broj, String punoIme, int stanje) {
		super();
		this.broj = broj;
		this.punoIme = punoIme;
		this.stanje = stanje;
	}
	

	public String getBroj() {
		return broj;
	}

	public void setBroj(String broj) {
		this.broj = broj;
	}

	public String getPunoIme() {
		return punoIme;
	}

	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}

	public int getStanje() {
		return stanje;
	}
	
	
	public void promenaStanja(int suma) {
		this.stanje = this.stanje + suma;
	}
	public void print() {
		System.out.println(this.punoIme + " - " + this.broj);
		System.out.println("Stanje na racunu je " + this.stanje + " rsd.");
		System.out.println();
	}
}
