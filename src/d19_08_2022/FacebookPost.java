package d19_08_2022;

public class FacebookPost {
//	   ime i prezime korisnika koji je objavio post
//	   ime i prezime korisnika na kom je profilu objavljen post
//	   tekst objave
//	   broj lajkova
//	   broj deljenja
//	/			    Konstruktore:
//	   difoltni konstuktor
//	   konstuktor koji postavlja ime i prezime korisnika ko je objavio, korisnika na kom je profilu objavnljen i tekst objave
//	     			Od metoda:
//	   like(), koja povecava broj lajkova za 1.
//	   dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//	   share(), koja povecava broj deljenja za 1
//	   print(), koja stampa objavu u formatu:
//	   (ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//	   (tekst objave)
//	   Likes (broj lajkova) | Shares (broj deljenja)
	
	private String punoImeAutora;
	private String punoImeProfila;
	private String tekst;
	private int lajkovi;
	private int deljenja;
	
	public void FacebookPost() {
		
	}

	public FacebookPost(String punoImeAutora, String punoImeProfila, String tekst) {
		this.punoImeAutora = punoImeAutora;
		this.punoImeProfila = punoImeProfila;
		this.tekst = tekst;
	}
	public void like() {
		lajkovi++;
	}
	public void dislike() {
		lajkovi--;
		if(lajkovi < 0) {
			lajkovi = 0;
		}
	}
	public void share() {
		deljenja++;
	}
	public void print() {
		System.out.println(this.punoImeAutora + " >>> " + punoImeProfila);
		System.out.println(this.tekst);
		System.out.println("Likes " + this.lajkovi +" | Shares " + this.deljenja);
	}
}
