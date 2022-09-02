package d26_08_2022;

public class Igrac extends Osoba {
//	Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//		broj (broj koji igrac nosi)
//		poziciju koju igra (odbrambeni, napadac, … )
//		kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//		default-ni konstuktor
//		konstuktor sa parametrima
//		gettere i settere za broj, kapiten i poziciju
//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
	private int brDresa;
	private String pozicija;
	private boolean kapiten;
	
	
	public Igrac() {
	}
	public Igrac(int brDresa, String pozicija, boolean kapiten) {
		super();
		this.brDresa = brDresa;
		this.pozicija = pozicija;
		this.kapiten = kapiten;
	}
	public int getBrDresa() {
		return brDresa;
	}
	public void setBrDresa(int brDresa) {
		this.brDresa = brDresa;
	}
	public String getPozicija() {
		return pozicija;
	}
	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}
	public boolean isKapiten() {
		return kapiten;
	}
	public void setKapiten(boolean kapiten) {
		this.kapiten = kapiten;
	}
	
	@Override
	public void stampaj() {
		super.stampaj();
		System.out.print("Broj: " + this.brDresa + ", pozicija: " + this.pozicija + ", kapiten: " + this.kapiten);
	}
}
