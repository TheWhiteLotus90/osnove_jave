package p26_08_2022;

public class Student extends Osoba{
// broj indeksa
//	dug za skolarinu 
//	konstuktor sa parametrima
//	metodu uplati skolarinu koja umanjuje dug za prosledjenu vrednost. Metoda prima iznos
//	uplate kao parametar metode.
//	Napisati metod stampajStudenta da stampa sve podatke o studentu
	
	private int brIndexa;
	private int dug;
	public Student(String punoIme, String jmbg, int brIndexa, int dug) {
		super(punoIme, jmbg);
		this.brIndexa = brIndexa;
		this.dug = dug;
	}
	
	public void uplatiSkolarinu(int rata) {
		this.dug = this.dug - rata;
	}
	public void stampajStudenta() {
	
	}
}
