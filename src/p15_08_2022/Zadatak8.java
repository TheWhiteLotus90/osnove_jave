package p15_08_2022;

public class Zadatak8 {

	public static void main(String[] args) {
//	Napisati metodu koja proverava da li je trougao pravougli. 
//		Metoda prima stranice trougla i hipotenuzu trougla. 
//		Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.
//		Trougao je pravougli ukoliko je a*a+b*b=c*c
		
//		boolean z = trougao(4, 8, 9);
		if (trougao(2, 2, 8) == true) {
			System.out.println("Je pravougli.");
		} else {
			System.out.println("Nije pravougli.");
		}

	}

	public static boolean trougao(int a, int b, int c) {
//		if(a * a + b * b == c * c) {
//			return true;
//		}
//			return false;
		return a * a + b * b == c * c; // laksi nacin
	}
}
