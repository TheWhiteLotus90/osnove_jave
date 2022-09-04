package p25_08_2022;

public class Reakcija {
//	tip reakcije (smajli, like, srce)
//	ime i prezime korisnika koji je reagovao 
//	gettere, settere i konstruktore
//
	
	private String reakcija;
	private String punoIme;
	
	public Reakcija() {
		
	}
	public Reakcija(String reakcija, String punoIme) {
		this.reakcija = reakcija;
		this.punoIme = punoIme;
	}
	
	public String getReakcija() {
		return reakcija;
	}
	public void setReakcija(String reakcija) {
		this.reakcija = reakcija;
	}
	public String getPunoIme() {
		return punoIme;
	}
	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}
	
	public void print() {
		System.out.println(this.punoIme + " regovao " + this.reakcija);
	}
}
