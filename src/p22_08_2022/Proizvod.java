package p22_08_2022;

public class Proizvod {
// Naziv proizvoda
//	kupca/musteriju
//	cenu izrade proizvoda
//	gettere i settere
//	konstruktore
//	Metodu za racunanje cene proizvoda, koja racuna cenu proizvoda po formuli:
//	cena izrade * 1.9 * (100 - popust na clansku karticu) / 100
//	Metodu za stampanje proizvoda u formatu:
//	naziv proizvoda - cena
//	ime i prezime - broj kartice
	
	private String naziv;
	private Kupac kupac; // mora da bude tipa Kupac, ne string, jer nama trebaju sve info iz kupca 
	private int cena;
	
	public Proizvod(String naziv, Kupac kupac, int cena) { //setovan kupac u konstruktoru

		this.naziv = naziv;
		this.kupac = kupac;
		this.cena = cena;
	}


	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
//	public Kupac getKupac() {
//		return kupac;
//	}
//	public void setKupac(Kupac kupac) {
//		this.kupac = kupac;
//	}
	public int getCena() {
		return cena;
	}
	public void setCena(int cena) {
		this.cena = cena;
	}
	
	public double cenaProizvoda() {
		return this.cena * 1.9 * (100 - this.kupac.getKarta().getPopust()) / 100; //
	}
	
	public void print() {
		System.out.println(this.naziv + " - " + this.cenaProizvoda());
		this.kupac.print();
	}
	
	
}
