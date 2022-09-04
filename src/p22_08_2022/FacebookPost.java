package p22_08_2022;

public class FacebookPost {
//	opis
//	korisnik (referenca na korisnika koji je kreirao post)
//	konstrukore koje mislite da su vam potrebni
//	metoda print, stampa u formatu:
//	(ime) (prezime)
//	(opis post-a)
	
	private String opis;
	private Korisnik autor; // nauci
	
	public FacebookPost() {
		
	}
	public FacebookPost(String opis, Korisnik autor) {
		this.opis = opis;
		this.autor = autor;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public Korisnik getAutor() {
		return autor;
	}

	public void setAutor(Korisnik autor) {
		this.autor = autor;
	}

	
	public void print() {
		this.autor.print();
//		System.out.println(this.autor.getIme() + " " + this.autor.getPrezime());
		System.out.println(this.opis);
	}
	
}
