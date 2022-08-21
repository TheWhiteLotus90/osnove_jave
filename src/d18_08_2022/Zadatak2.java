package d18_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
//	Kreirati klasu FacebookPost koja ima:
//		   Od atributa:
//			   ime i prezime korisnika koji je objavio post
//			   ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//			   tekst objave
//			   broj lajkova
//			   broj deljenja
//			     Od metoda:
//			   like(), koja povecava broj lajkova za 1.
//			   dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//			   share(), koja povecava broj deljenja za 1
//			   print(), koja stampa objavu u formatu:
//			   (ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//			   (tekst objave)
//			   Likes (broj lajkova) | Shares (broj deljenja)
//
//			   U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
//
//
//			   Primer stampanja:
//			   Milan Jovanovic >>> Pera Peric
//			   Ovo je tekst objave
//			   Likes 3 | Shares 1

		FacebookPost Post1 = new FacebookPost();
		FacebookPost Post2 = new FacebookPost();

		Post1.punoImeKorisnika = "Nevena Grujic";
		Post1.punoImeProfila = "Donna_Nena";
		Post1.tekstObjave = "Instagram post";
		Post1.lajkovi = 9;
		Post1.deljenja = 5;

		Post1.like();
		Post1.dislike();
		Post1.share();
		Post1.print();

		Post2.punoImeKorisnika = "Karl LN";
		Post2.punoImeProfila = "Smbd log";
		Post2.tekstObjave = "Summer time";
		Post2.lajkovi = 4;
		Post2.deljenja = 2;

		Post2.like();
		Post2.dislike();
		Post2.share();
		Post2.print();
	}

}
