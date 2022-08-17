package p16_08_2022;

public class Auto {
//	Kreirati klasu Auto koja ima:
//		ime i prezime vozaca
//		marku automobila
//		broj vrata
//		potrosnju na 100km (npr: 10)
//		trenutnu brzinu kojom se auto krece
//		metodu za stampu koja stampa podatke u formatu:
//		[Vozac]
//			[Marka] - [br vrata]-ro vrata
//			Sa potrosnjom od [potrosnja] l na 100km
//			[Trenutna brzina auta] km/h je trenutna brzina.
//			Primer:
//			Milan Jovanovic
//			BMW - 5-ro vrata
//			Sa potrosnjom od 10 l na 100km
//			200 km/h je trenutna brzina

	public String vozac;
	public String marka;
	public int brVrata;
	public double potrosnja;
	public int brzina;
	
//	U okviru klase Auto, implementirati jos 2 metode:
//	metoda koja vraca informaciju da li je vozac prekoracio brzinu. Kao parametar metode se prima
//	ogranicenje (kao broj) a metoda vraca true ili false ako je trenutna brzina veca od ogranicenja.
//	metoda koja vraca visinu novcane kazne za prekoracenje, za svaku jedinicu prekoracenja placa se 
//	1000din. Metoda od parametara prima ogranicenje brzine
//	U glavnom programu pozvati ove metode i odstmpajte neke poruke na osnovu informacija koje dobijete
//	od njih.

	
	public void print() {
		System.out.println(this.vozac);
		System.out.println(this.marka + " - " + this.brVrata + " vrata");
		System.out.println("Sa potrosnjom od " + this.potrosnja + " l na 100km");
		System.out.println(this.brzina + " km/h je trenutna brzina");
	}

	
	int ogranicenje = 140; // ne kreira se tu
	
	public boolean merac(int ogranicenje) {
		if(this.brzina > ogranicenje) {
			return true; // podseti se
		}else{
			return false;
		}
	}
	public int kazna(int ogranicenje) {
		if(this.brzina > ogranicenje) {
			return(this.brzina - ogranicenje) * 1000;
		}
		return 0;
	}
	// brzina se menja samo kad se desi dodela a ne u returnu
	
}
