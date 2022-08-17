package p15_08_2022;

public class Zadatak7 {

	public static void main(String[] args) {
//	Napisati metodu koja vraca suprotno negativni broj od prosledjenog. Metoda prima broj N 
//	i vraca ga sa negativnom vrednoscu.
//		Primer: Ako se metoda pozove za N=10, vraca -10
//				Ako se metoda pozove za N=-11, vraca 11

		int z = broj(-9);
		System.out.println("Z je " + z + ", suprotan broj je: " + broj(z));
		
	}		

	public static int broj (int n){
		if(n < 0) {
			return n * (-1);
		}
		else {
			return n * (-1);
		}
//		return n * (-1);
	}
	
}
