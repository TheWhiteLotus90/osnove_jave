package p16_08_2022;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
//		Kreirati klasu Racun koja ima
//		broj racuna (npr: 840-23932-323)
//		ime i prezime vlasnika
//		stanje na racunu
//		U mainu kreirati minimum dva racuna sa pratecim podacima i ostampati podatke za svaki objekat.


//	Dopuniti zadatak tako da se vrsi transakcija sa prvog na drugi racun. Korisnik unosi
//	svotu koja se skida sa prvog i prebacuje na drugi racun.

//Primer izvrsenja:
//Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 1000
//Primalac: Marko Markovic, 840-23932-334, stanje: 200
//Unesite sumu za transakciju: 500
//Stanje nakon stransakcije
//Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 500
//Primalac: Marko Markovic, 840-23932-334, stanje: 700
		
		
		Racun prviRacun = new Racun();
		
		prviRacun.brRacuna = "445-456454-54";
		prviRacun.imeIprezime = "Nevena Grujic";
		prviRacun.stanje = 500000;
		
		System.out.println(prviRacun.brRacuna);
		System.out.println(prviRacun.imeIprezime);
		System.out.println(prviRacun.stanje);
		System.out.println();
		
		
		Racun drugiRacun = new Racun();
		
		drugiRacun.brRacuna = "258-4154564-65";
		drugiRacun.imeIprezime = "Petar Peric";
		drugiRacun.stanje = 46546565;
		
		System.out.println(drugiRacun.brRacuna);
		System.out.println(drugiRacun.imeIprezime);
		System.out.println(drugiRacun.stanje);
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Posiljalac: " + prviRacun.imeIprezime + ", " + prviRacun.brRacuna + ", stanje " + prviRacun.stanje);
		System.out.println("Primalac: " + drugiRacun.imeIprezime + ", " + drugiRacun.brRacuna + ", stanje " + drugiRacun.stanje);
			
		System.out.println("Unesite svotu za transakciju: ");
		int svota = s.nextInt();
		
//		prviRacun.stanje = prviRacun - 200;
		
		
		System.out.println("Stanje nakon transakcije: ");
		
		System.out.println("Posiljalac: " + prviRacun.imeIprezime + ", " + prviRacun.brRacuna + ", stanje " + (prviRacun.stanje));
		System.out.println("Primalac: " + drugiRacun.imeIprezime + ", " + drugiRacun.brRacuna + ", stanje " + (drugiRacun.stanje));
		

	}

}
