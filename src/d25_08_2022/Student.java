package d25_08_2022;

import java.util.ArrayList;

import p25_08_2022.Sastojak;

public class Student {
//	broj indeksa
//	ime i prezime
//	tip studija (osnovne, master, doktorske)
//	niz ispita
//	konstuktore koje mislite da ce vam trebati
//	gettere i settere za indeks, ime i prezime, tip studija
//	getter za niz predmeta
//	metodu dodaj ispit u niz ispita
//	metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//	metodu stampaj koja stampa u formatu:
//	(broj indeksa) - (ime i prezime) - (tip studija)
//	Predmeti:
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	Prosecna ocena: (prosecna ocena)
	
	private int index;
	private String punoIme;
	private String studije;
	private ArrayList<Ispit> ispiti = new ArrayList<Ispit>();
	
	public Student() {
		
	}
	public Student(int index, String punoIme, String studije) {
		this.index = index;
		this.punoIme = punoIme;
		this.studije = studije;
	}
	
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public String getPunoIme() {
		return punoIme;
	}
	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}
	public String getStudije() {
		return studije;
	}
	public void setStudije(String studije) {
		this.studije = studije;
	}
	public ArrayList<Ispit> getIspiti() {
		return ispiti;
	}
	public void dodajIspit(Ispit ispit) { 
		this.ispiti.add(ispit);
	}
	public int prosek() {
		int zbirPolozenih = 0;
		int brojPolozenih = 0;
		
		for (int i = 0; i < ispiti.size(); i++) {
			if (ispiti.get(i).polozen() == true) {
				zbirPolozenih = zbirPolozenih + ispiti.get(i).getOcena();
				brojPolozenih++;
			}
		}
		return (zbirPolozenih/brojPolozenih);
	}
	public void stampaj () {
		System.out.println(this.index + " - " + this.punoIme + " - " + this.studije);
		System.out.println("Predmeti: ");
		
		for (int i = 0; i < ispiti.size(); i++) {
			this.ispiti.get(i).stampaj();
		}
		System.out.println("Prosecna ocena: " + this.prosek());
	}
	
	
}
