package p22_08_2022;

public class Reziser {
//	ime i prezime rezisera
//	startost
//	konstruktore, gettere i settere koji su potrebni
//	metodu print koja stampa podatke u formatu
//	ime prezime, starost.god
	
	private String punoIme;
	private int starost;
	
	public Reziser() {	
	}
	
	public Reziser(String punoIme, int starost){
		this.punoIme = punoIme;
		this.starost = starost;
	}

	public String getPunoIme() {
		return punoIme;
	}

	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}

	public int getStarost() {
		return starost;
	}

	public void setStarost(int starost) {
		this.starost = starost;
	}
	public void print() {
		System.out.print("Reziser: " + this.punoIme + ", ");
		System.out.println(this.starost + ".god");
	}
}
