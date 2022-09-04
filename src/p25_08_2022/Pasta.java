package p25_08_2022;

import java.util.ArrayList;
import java.util.Iterator;

public class Pasta {
//	niz sastojaka
//	metodu za dodavanje sastojka
//	defaultni konstruktor
//	metodu cena paste, tako sto sumira cene svih sastojaka
//	metodu za stampu koja stampa podatke u formatu:
//	Pasta je sa sastojcima:
//	naziv - cena.din
//	naziv - cena.din
//	naziv - cena.din
//	Cena paste je cena.din
//
	private ArrayList<Sastojak> sastojci = new ArrayList<Sastojak>();
	
	public Pasta() {
	
	}
	
	public void dodajSastojak(Sastojak sastojci) {
		this.sastojci.add(sastojci);
	}
	   //povratni tip
	private int cenaPaste() { // zasto private
		int suma = 0;
		for(int i = 0; i < sastojci.size(); i++) {
			suma = suma + sastojci.get(i).getCena();
		}
		return suma;
	}

	public void print() {
		System.out.println("Pasta je sa sastojcima: ");
		for (int i = 0; i < sastojci.size(); i++) {
				this.sastojci.get(i).print(); // nauci
		}
		System.out.println("Cena paste je: " + this.cenaPaste() + " din.");
	}
	
}
