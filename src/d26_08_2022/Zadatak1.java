package d26_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Kreirati klasu Osoba koja ima:
//		ime i prezime
//		jmbg
//		godinu rodjenja
//		default-ni konstuktor
//		konstuktor sa parametrima
//		gettere i settere 
//		metodu stampaj koja stampa u formatu:
//		(ime i prezime), (jmbg), (godina rodjenja)
//
//		Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//		broj (broj koji igrac nosi)
//		poziciju koju igra (odbrambeni, napadac, … )
//		kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//		default-ni konstuktor
//		konstuktor sa parametrima
//		gettere i settere za broj, kapiten i poziciju
//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//		Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//		godine iskustva
//		tip trenera (kondicioni, za igru, pomocni, personalni)
//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//
//		U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.


		Osoba n = new Osoba("Nesa Nesic", "4566566585", 1990);
		Osoba m = new Osoba("Misa Misic", "4598782958", 1995);
		n.stampaj();
		m.stampaj();

		Trener nn = new Trener(10, "personalni");
		Trener mm = new Trener(16, "pomocni");
		nn.stampaj();
		mm.stampaj();

		Igrac s = new Igrac(9, "napadac", true);
		Igrac r = new Igrac(6, "odbrambeni", false);
		s.stampaj();
		r.stampaj();

	}

}
