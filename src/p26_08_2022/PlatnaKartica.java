package p26_08_2022;

public class PlatnaKartica {
//	atribut suma  - cuva trenutnu sumu novca na kartici u dolarima
//	  atribut broj kartice  primer: 4012-1239-1221-3381
//	  atribut godina - godina do kada vazi kartica
//	  atribut mesec-  mesec do kada vazi kartica
//	  konstruktor sa parametrima
//	  gettere za sve atribute, bez settera
//	   metodu dodajSredstva koja povecava sumu za unetu vrednost
//	  metodu izvrsiTransakciju koja skida prosledjenu vrednost sa racuna.
//	  metodu koja stampa podatke o kartici u formatu:
//		  4012-1239-1221-3381, 11/2019, $212
	
	protected int suma;
	protected String brKartice;
	protected int godina;
	protected String jun;
	public PlatnaKartica(int suma, String brKartice, int godina, String jun) {
		super();
		this.suma = suma;
		this.brKartice = brKartice;
		this.godina = godina;
		this.jun = jun;
	}
	public int getSuma() {
		return suma;
	}
	public void setSuma(int suma) {
		this.suma = suma;
	}
	public String getBrKartice() {
		return brKartice;
	}
	public void setBrKartice(String brKartice) {
		this.brKartice = brKartice;
	}
	public int getGodina() {
		return godina;
	}
	public void setGodina(int godina) {
		this.godina = godina;
	}
	public String getJun() {
		return jun;
	}
	public void setJun(String jun) {
		this.jun = jun;
	}
	
	
	public void dodajSredstva(int uplata) {
		this.suma = this.suma + uplata;
	}
	public void izvrsiTransakciju() {
		
	}
}
