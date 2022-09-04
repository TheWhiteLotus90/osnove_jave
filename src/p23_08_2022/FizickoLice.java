package p23_08_2022;

public class FizickoLice {
//	ime i prezime
//	broj licne karte
//	jmbg
//	podatak da li je osoba vec jednom kupovala nekretninu preko agencije (boolean)
//	konstuktore
//	gettere i settere, jmbg ne sme da se menja
//	metodu stampaj, koja stmpa podatke u formatu:
//	ime i prezime, broj licne karte
	
	private String punoIme;
	private int brLK;
	private String jmbg;
	private boolean kupovina;
	
	public FizickoLice(String punoIme, int brLK, String jmbg, boolean kupovina) {
		this.punoIme = punoIme;
		this.brLK = brLK;
		this.jmbg = jmbg;
		this.kupovina = kupovina;
	}
	
	
	public String getPunoIme() {
		return punoIme;
	}
	public int getBrLK() {
		return brLK;
	}
	public String getJmbg() {
		return jmbg;
	}
	public boolean isKupovina() {
		return kupovina;
	}
	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}
	public void setBrLK(int brLK) {
		this.brLK = brLK;
	}
	public void setKupovina(boolean kupovina) {
		this.kupovina = kupovina;
	}
	
	public void print() {
		System.out.println(this.punoIme + ", " + this.jmbg);
	}
}
