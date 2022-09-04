package p23_08_2022;

public class Korisnik {
//	Kreirati klasu Korisnik koja ima:
//	ime i prezime 
//	tip licence (basic/pro/premium)
//	konstruktore. Po difoltu korisnik ima basic licencu. 		// ?
//	gettere i settere za sve atribute, sem za tip licence koja ne moze da se menja // obrati paznju
//	metodu pretplati se koja postavlja licencu u zavisnosi od uplacene sume:
//	ako je uplata 100, postavlja licencu na “pro”
//	ako je uplata 150, postavlja licencu na “premium”
//	Metoda kao parametar prima vrednost uplate $100 ili $150 // nejasno
//	metodu ponisti pretplatu koja postavlja licencu na basic
//	metodu koja vraca maksimalnu duzinu trajanja video poziva u zavisnosti od licence
//	ako je basic, vraca 40min
//	ako je pro, vraca 240min
//	ako je  premium, vraca 1440min
//	metodu za stampu koja stampa u formatu:
//	ime i prezime
	
	private String punoIme;
	private String tip;
	
	public Korisnik(String punoIme) { //ne unosi se parametar tip
		this.punoIme = punoIme;
		this.tip = "basic";
	}
	public Korisnik() {
		this.tip = "basic";
	}
	
	public String getPunoIme() {
		return punoIme;
	}
	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}
	public String getTip() {
		return tip;
	}
	
	
	public void pretplatiSe(int uplata) { 
		if(uplata == 100) {
			tip = "pro"; // zasto ne moze equals
		}else if(uplata == 150) {
			tip = "premium";
		}
	}
	
	public void ponistiPretplatu() {
		tip.equals("basic");
	}
	
	public int maxDuzina() {
		if(tip == "basic") {
			return 40;
		}else if(tip == "pro") {
			return 240;
		}else if(tip == "premium") {
			return 1440;
		}return 0;
		
//		public int maxDuzina() {
////			if (this.tip.equals("basic"))
////			if (this.getTip().equals("basic"))
//			
//			if (this.tip.equals("basic")) {
//				return 40;
//			} else if (this.tip.equals("pro")) {
//				return 240;
//			}
//			return 1440;
//		}
	}
	public void print() {
		System.out.println(this.punoIme);
	}
}
