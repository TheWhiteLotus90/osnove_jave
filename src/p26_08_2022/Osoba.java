package p26_08_2022;

public class Osoba {
//	ime i prezime
//	jmbg
//	konstuktor sa parametrima
//	metodu stampaj koja stampa podatke u formatu
//				ime prezime, jmbg
	
	protected String punoIme; // pr
	protected String jmbg;
	
	public Osoba(String punoIme, String jmbg) {
		super();
		this.punoIme = punoIme;
		this.jmbg = jmbg;
	}
	
	
	
	public String getPunoIme() {
		return punoIme;
	}

	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	
	public void print() {
		System.out.println(this.punoIme +", "+ this.jmbg);
	}
	
}
