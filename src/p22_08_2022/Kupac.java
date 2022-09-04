package p22_08_2022;

public class Kupac {
//	ime i prezime
//	clansku kartu
//	gettere i settere, clanska karta ne moze da se menja
//	konstruktore
//	metodu stampaj koja stampa u formatu
//	ime i prezime - broj kartice
	
	private String punoIme;
	private ClanskaKarta karta;
	
	public Kupac() {

	}

	public Kupac(String punoIme, ClanskaKarta karta) {
		this.punoIme = punoIme;
		this.karta = karta;
	}

	public String getPunoIme() {
		return punoIme;
	}

	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}

	public ClanskaKarta getKarta() {
		return karta;
	}

	public void setKarta(ClanskaKarta karta) {
		this.karta = karta;
	}
	public void print() {
		System.out.println(this.punoIme + " " + this.karta.getBrojKartice());
	}
	
	
}
