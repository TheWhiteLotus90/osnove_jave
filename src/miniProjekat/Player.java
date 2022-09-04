package miniProjekat;

public class Player {
//	ime i prezime
//	gettere i settere
//	konstuktore
//	metodu print, koja stampa ime i prezime igraca

	private String fullName;

	public String getPunoIme() {
		return fullName;
	}

	public void setPunoIme(String fullName) {
		this.fullName = fullName;
	}

	public Player(String fullName) {
		this.fullName = fullName;
	}

	public Player() {

	}
	
	public void print() {
		System.out.println("Name: " + this.fullName);
	}
}
