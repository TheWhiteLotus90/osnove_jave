package d22_08_2022;

public class Autor {
//	-ime i prezime
//	-konstuktore koje mislite da su vam potrebni
//	-gettere i settere za atribute
//	-metodu print koja stampa u formatu:
//	(ime autora) (prezime autora)
	
	private String punoIme;
	

	public Autor(String punoIme) {
	this.punoIme = punoIme;
	}
	
	public String getPunoIme() {
		return punoIme;
	}
	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}
	
	public void print() {
		System.out.println("Autor: " + this.punoIme);	
	}
}
