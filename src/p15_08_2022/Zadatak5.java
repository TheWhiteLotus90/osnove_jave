package p15_08_2022;

public class Zadatak5 {

	public static void main(String[] args) {
//	Napisati metodu stampajApsolutnuVrednost, koja stampa apsolutnu vrednost
//	prosledjene vrednosti.

		stampajApsolutnuVrednost(9);
		
	}
	
	public static void stampajApsolutnuVrednost(int x) {
		if(x < 0) {
			System.out.println(x * (-1));
		}else {
			System.out.println(x);
		}		
	}
	
}
