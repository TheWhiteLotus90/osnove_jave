package p26_08_2022;

public class VisaKartica {
//	ovlaceno lice, cuva se ime i prezime osobe koja ima ovlascenje da podize novac u ekspozituri.
//	getter i setter za ovlasceno lice
//	konstruktor sa parametrima
//	  implementira metodu izvrsiTransakciju,  tako da na prosledjenu sumu dodaje proviziju od 1.8% sume.
//	Najmanja provizija moze biti $4.
//	  implementira metodu koja stampa podatke o kartici u formatu:
//		  Visa Card: 4012-1239-1221-3381, 11/2019, $212
	
	private String ovlasceni;
	

	public String getOvlasceni() {
		return ovlasceni;
	}
	public void setOvlasceni(String ovlasceni) {
		this.ovlasceni = ovlasceni;
	}
	public VisaKartica(String ovlasceni) {
		super();
		this.ovlasceni = ovlasceni;
	}
	
	
}
