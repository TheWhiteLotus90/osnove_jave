package p19_08_2022;

public class Tacka {
//	//	Za klasu Tacka, koja ima privatne atribute:
//	x - x koordinata
//	y - y koordinata
//	Javne metode:
//	metodu stampaj
//	imamo difoltni konstruktor
//	imamo konstuktor koji prima obe koordinate za kreiranje objekta
//	geter za x
//	geter za y
//	seter za x
//	seter za y
//
//	U glavnom programu kreirati dva objekta:
//	Jedan preko difoltnog konstuktora i postavite koordinate na 10 i 20
//	Drugi objekat preko konsuktora sa parametrima i postavite kooridnate na 30 i 40
	private int x; // atributi
	private int y;

	public Tacka() {
		//difoltni konstruktor
	}
	public Tacka(int x, int y) { //prima parametre za kreiranje objekta
		this.x = x;
		this.y = y;
	}
	public void setX(int x) { // omogucimo da mozemo da setujemo vrednsti u mainu
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return y;

	}
	public void print() {
		System.out.println("(" + x + ", " + y + ")");
	}
	
}

