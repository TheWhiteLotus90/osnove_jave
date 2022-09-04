package p22_08_2022;

public class Film {
//	naziv filma
//	iz koje godine je film 
//	reziser
//	konstruktore, gettere i settere koji su potrebni
//	metodu print koja stampa podatke u formatu
//	naziv filma, godina
//	Rezirao je: Ime prezime, starost.god
//	konstruktore, gettere i settere koji su potrebni
//	metodu print koja stampa podatke u formatu
//	naziv filma, godina
//	Rezirao je: Ime prezime, starost.god

	
	private String naziv;
	private int godina;
	private Reziser reziser;
	
	public Film() {
		
	}
//	public Reziser getReziser() {	1.nacin preko gettera i settera pristupamo 
//		return reziser;
//	}

//	public void setReziser(Reziser reziser) {
//		this.reziser = reziser;
//	}
	
	public Film(String naziv, int godina, Reziser reziser) { // 2. nacin pravimo parametar nov
		this.naziv = naziv;
		this.godina = godina;
		this.reziser = reziser;
	}
	
	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getGodina() {
		return godina;
	}

	public void setGodina(int godina) {
		this.godina = godina;
	}
	
//	public void print() {
//		System.out.println(naziv + ", " + godina);
//		System.out.println("Rezirao je " + naziv + " " + godina);
//	}
	public void print() {
		System.out.println("Naziv: " + this.naziv);
		System.out.println("Godina: " + this.godina);
//		this.reziser.stampaj(); 
//		System.out.println("Rezirao ga je " + this.reziser.getPunoIme()); moze tako da se uzme odredjena info
		reziser.print();// a moze i iz Reziser print
	}
}