package d16_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
//		Kreirati klasu SmartAirConditioning koja ima:
//			atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//			atribut za izabranu temperaturu 
//			atribut za mod (hladi/greje) - string
//			metodu za stampu (proizvoljno)
//			metodu koja vraca informaciju da li je napolju veca temperatura od one na koju je klima postavljena.
//			Metoda kao parametar prima temperaturu koja je napolju.
//
//			U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i za svaki od njih pozvati metode

		SmartAirConditioning a = new SmartAirConditioning();
		SmartAirConditioning b = new SmartAirConditioning();

		a.marka = "Beko";
		a.temperatura = 17;
		a.mod = "Hladi";

		a.stampa();
		System.out.println("Temperatura napolju je trenutno veca: " + a.test(30));
		System.out.println();

		b.marka = "Elin";
		b.temperatura = 21;
		b.mod = "Hladi";
		b.stampa();
		System.out.println("Temperatura napolju je trenutno veca: " + b.test(25));





	}

}
