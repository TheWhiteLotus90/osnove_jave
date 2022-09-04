package p23_08_2022;

public class Ugovor {
//	godinu, dan i mesec sklapanja ugovora
//	osobu koja prodaje nekretninu (fizicko lice)
//	osobu koja kupuje nekretninu (fizicko lice)
//	cenu za koju se prodaje nekretnina
//	adresu nekretnine (ulica br., grad)
//	metodu koja vraca procenat zarade
//	za osobu koja je vec kupovale nekretninu preko agencije je 0.02 dok je za one koji nisu 0.03
//	metodu koja racuna zaradu agencije pri prodaji nekretninte koja ukljucujei poreze, takse i usluge agencije, prema formuli:
//	1000 + cena za koju se prodaje * procenat zarade
//	metodu koja stampa ugovor u formatu:
//	Dana (dan.mesec.godina.)god sklopljen je ugovor izmedju (print prodavca) i (print kupca) o kupovini nekretnine   
//	po ceni od (cena nekretnin) pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost u iznosu od (zarada agencije)
	
	private String datum;
	private FizickoLice prodavac;
	private FizickoLice kupac;
	private int cena;
	private String adresa;
	
	
	
	public Ugovor(String datum, FizickoLice prodavac, FizickoLice kupac, int cena, String adresa) {
		this.datum = datum;
		this.prodavac = prodavac;
		this.kupac = kupac;
		this.cena = cena;
		this.adresa = adresa;
	}
	public double vratiProcenat() {
		if(kupac.isKupovina() ==  true) { // ne mora: == true (isto radi); a za false samo ispred stavi !
			return 0.02;
		}else{
			return 0.03;
		}	
//		return this.kupac.isKupovina() ? 0.02 : 0.03;    *novi skraceni izraz
	}
	public double zaradaAgencije() {
		return 1000 + this.cena * vratiProcenat();
	}
	public void print() {
		System.out.print("Dana " + this.datum +" god sklopljen je ugovor izmedju " + this.prodavac + " i " + this.kupac + "o kupovini");
		System.out.println("nekretnine " + this.adresa);
	}
}
