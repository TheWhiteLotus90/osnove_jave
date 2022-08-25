package d23_08_2022;

import java.util.ArrayList;

public class Zadatak1 {

	public static void main(String[] args) {
//	Zadatak
//	Kreirati klasu ZeleniKarton koja ima:
//			ime i prezime studenta 
//			broj indeksa 
//			naziv predmeta
//			ime i prezime profesora
//			ocenu - od 5 do 10
//			gettere i settere
//			konstruktore
//			metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//			metodu stampaj koja stampa podatke u formatu:
//					(naziv predmeta) - (ocena)
//					Student: ime i prezime, broj indeksa
//					Profesor: ime i prezime
//
//	U glavnoj klasi:
//			kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//			(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//			(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita

		ZeleniKarton z1 = new ZeleniKarton("Nevena Grujic", 4444, "Fin sistem ifin institucije", "Prof", 8);
		ZeleniKarton z2 = new ZeleniKarton("Nevena Grujic", 4444, "Bankarski menadzment", "Prof", 7);
		ZeleniKarton z3 = new ZeleniKarton("Nevena Grujic", 4444, "Poslovne finansije", "Prof", 7);
		ZeleniKarton z4 = new ZeleniKarton("Nevena Grujic", 4444, "MEO", "Prof", 6);
		ZeleniKarton z5 = new ZeleniKarton("Nevena Grujic", 4444, "Privredno pravo", "Prof", 8);
		ZeleniKarton z6 = new ZeleniKarton("Nevena Grujic", 4444, "Osnove ekonomije", "Prof", 6);
		ZeleniKarton z7 = new ZeleniKarton("Nevena Grujic", 4444, "Upravljacko rac", "Prof", 7);
		ZeleniKarton z8 = new ZeleniKarton("Nevena Grujic", 4444, "Makroekonomija", "Prof", 7);
		ZeleniKarton z9 = new ZeleniKarton("Nevena Grujic", 4444, "Informatika", "Prof", 7);
		ZeleniKarton z10 = new ZeleniKarton("Nevena Grujic", 4444, "Finansijsko rac", "Prof", 7);
		
		z1.print();
		z2.print();
		z3.print();
		z4.print();
		z5.print();
		z6.print();
		z7.print();
		z8.print();
		z9.print();
		z10.print();
		
		
		ArrayList<ZeleniKarton> ispiti = new ArrayList<ZeleniKarton>();
		
		ispiti.add(z1);
		ispiti.add(z2);
		ispiti.add(z3);
		ispiti.add(z4);
		ispiti.add(z5);	
		ispiti.add(z6);
		ispiti.add(z7);
		ispiti.add(z8);
		ispiti.add(z9);
		ispiti.add(z10);	

		for (int i = 0; i < ispiti.size(); i++) {
			ispiti.get(i).print(); 
			System.out.println();
			
		}
	}
}
