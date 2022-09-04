package p19_08_2022;

public class Predavanje1 {

	public static void main(String[] args) {
		
		Korisnik k = new Korisnik();
		// new - naredba za novo mesto, memoriju, da se dinamicki zauzme prostor, a sa desne stane je tip na osnovu kog zauzima memoriju 
//		levo - napravi promenljivu k koja moze da cuva referencu na objekat koji je po strukturi korisnik
//		desno - kreiranje tog objekta pozivom konstruktora, 
//		konstruktor - Korisnik();
		
		k.setIme ("Nevena");	
		k.setPrezime ("Grujic");
		k.setEmail ("nenaglahgg"); //sve sto smo radili dovde, ispod je odradjeno preko konstruktora s parametrom
		
		System.out.println(k.getIme() + " " + k.getPrezime());
	}

		Korisnik n = new Korisnik("Nevena", "Grujic", "nenaglhdk"); // podaci isti kao kroz main,
//											   samo sto su ovde preko parametra, skraceno pisanje
//
//		k.ime = "Milan";
//		k.prezime = "Jovanovic";
//		k.email = "milan@gmail.com";

		
//		n.stamapaj();
//		
//		Korisnik l = new Korisnik("Lazar");
//		l.stamapaj();
		

}
