package p25_08_2022;

import java.util.ArrayList;

public class FacebookPost {
//	ime i prezime korisnika koji je stavio oglas
//	tekst objave
//	niz reakcija
//	metodu reaguj, koja dodaje reakciju u niz
//	(modifikacija za vezbu) Ukoliko se desi situacija da jedan isti korisnik reaguje na post
//	(tj. postoji rekacija korisnika sa istim imenom i prezimenom) izbaciti prethodnu reakciju i uracunati novu.
//	Primer: Milan - lajkuje
//		 Nemanja - lajkuje
//		 Milan - daje srce
//	Post ima lajk od Nemanje i srce od Milana.
//	privatnu metodu koja vraca broj reakcija odredjenog tipa (prosledjuje se tip reakcije koji moze da bude
//	smajli, like ili srce)
//
//	brojReakcija(“smajli) => 3
//	brojReakcija(“srce”) => 2
//	brojReakcija(“like”) => 1
//	brojReakcija(“cry”) => 0
//
//
//	metodu stampaj koja stampa podatke u formatu:
//	ime i prezime
//	tekst objave
//	Smajli 10 | Like 15 | Srce 2
	
	private String oglasivac;
	private String objava;
	
	private ArrayList<Reakcija> reakcije = new ArrayList<Reakcija>();
	
	public FacebookPost() {
		
	}		
	public FacebookPost(String oglasivac, String objava) {
		super();
		this.oglasivac = oglasivac;
		this.objava = objava;
	}


	public String getOglasivac() {
		return oglasivac;
	}
	public void setOglasivac(String oglasivac) {
		this.oglasivac = oglasivac;
	}
	public String getObjava() {
		return objava;
	}
	public void setObjava(String objava) {
		this.objava = objava;
	}
	public ArrayList<Reakcija> getReakcije() {
		return reakcije;
	}

	
	public void reaguj(Reakcija reakcija) {
		this.reakcije.add(reakcija);
	}
	
//	public int brojReakcija(String tipReakcije) {
//		int brojac = 0;
//		for (int i = 0; i < reakcije.size(); i++) {
//			
//		}
//	}
	
	public void print() {
		System.out.println(this.oglasivac);
		System.out.println(this.objava);
		System.out.println();
	}
}
