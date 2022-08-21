package d18_08_2022;

public class FacebookPost {
//	   ime i prezime korisnika koji je objavio post
//	   ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//	   tekst objave
//	   broj lajkova
//	   broj deljenja
	
	public String punoImeKorisnika;
	public String punoImeProfila;
	public String tekstObjave;
	public int lajkovi;
	public int deljenja;
	
	public void like () {
		this.lajkovi++;
		}

		public void dislike () {
			this.lajkovi--;
			if (this.lajkovi < 0) {
				this.lajkovi = 0;
			}
		}

		public void share () {
			this.deljenja++;
		}

		public void print () {
			System.out.println(this.punoImeKorisnika + " >>> " + this.punoImeProfila);
			System.out.println(this.tekstObjave);
			System.out.println("Likes " + this.lajkovi + " | Shares " + this.deljenja);
		}


		
}
