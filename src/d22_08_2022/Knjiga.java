package d22_08_2022;

public class Knjiga {
//	-ISBN
//	-naziv
//	-godina izdanja
//	-autor
//	-konstuktore koje mislite da su vam potrebni
//	-gettere i settere za atribute
//	-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//	(ISBN)
//	(naziv) - (godina izdanja)
//	autor: (ime autora) (prezime autora) 
//
	private int ISBN;
	private String naziv;
	private int izdanje;
	private Autor autor;
	
	public Knjiga(int iSBN, String naziv, int izdanje, Autor autor) {
		ISBN = iSBN;
		this.naziv = naziv;
		this.izdanje = izdanje;
		this.autor = autor;
	}

	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public int getIzdanje() {
		return izdanje;
	}
	public void setIzdanje(int izdanje) {
		this.izdanje = izdanje;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public void print() {
		System.out.println(this.ISBN);
		System.out.println(this.naziv + " - " + this.izdanje + ".");
//		System.out.println("Autor: " + autor.getPunoIme() ); 
		autor.print();
	}
	
}
