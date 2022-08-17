package p15_08_2022;

public class Zadatak3 {

	public static void main(String[] args) {
//		- Prva metoda koja stampa zvezdicu sa razmakom. 
//		- Druga metoda koja stampa samo novi red.
//		U glavnom programu je potrebno odstampati sledecu sliku koristeci metode koje smo definisali.
//		*  *  * 
//		*  *  
//		*  
		zvezdica();
		zvezdica();
		zvezdica();
		red();
		zvezdica();
		zvezdica();
		red();
		zvezdica();
			
		
	}
	public static void zvezdica() {
		System.out.print("* ");
	}
	public static void red() {
		System.out.println();
	}
}
