package p15_08_2022;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {
//	Napisati metodu koja stampa N zvezdica u istom redu. Broj zvezdica je odredjen parametrom N.
//	Ako se metoda pozove za N=5, metoda stampa 5 zvezdica i enter
//		N=5, print je=> * * * * * 
//
//		Ako se metoda pozove za N = 9, metoda stampa 9 zvezdica i enter
//		N=9, print je=> * * * * * * * * * 
		
//		(Za vezbanje)
//		Napisati main program koji koristi metodu definisanu u 6.zad tako da
//		stampa sledecu sliku za N. N unosi korisnik.
//
//
//		Primer izvrsenja:
//		Unesite N: 6
//		*
//		* *
//		* * *
//		* * * *
//		* * * * *
//		* * * * * * // radi se sa petljom i = 1, i <= n, i++ dole zvezdice(i) - ali u main
	
		zvezdice(5);
	}

	public static void zvezdice(int n) {
//		Scanner s = new Scanner(System.in);
//		System.out.println("Unesite n: ");
//		n = s.nextInt();
		
		for(int i = 0; i < n; i++) {	
		System.out.print("* ");
		}
	}
	
}
