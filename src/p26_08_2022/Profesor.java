package p26_08_2022;

public class Profesor extends Osoba{
//	naziv predmeta koji predaje
//	iznos plate
//	konstuktor sa parametrima
//	metodu povecaj platu. Metoda kao parametar prima procenat povecanja.
//	Napisati metodu stampajProfu da stampa sve podatke o profesoru
	
	private String predmet;
	private int plata;
	
//	public void Profesor() {
//		
//	}ne praviii
	
	public Profesor(String punoIme, String jmbg, String predmet, String plata) {
		super(punoIme, jmbg);
		this.predmet = predmet;
//		this.plata = plata;
	}
	
	//setere
	
	public void povecajPlatu(int povecanje) {
		this.plata = this.plata + povecanje;
	}
	public void stampajProfu() {
		//stampaj
		System.out.println("Predmet: "+ this.predmet);
		System.out.println("Plata: "+ this.plata);
	}
}
