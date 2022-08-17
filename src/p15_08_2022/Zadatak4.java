package p15_08_2022;

public class Zadatak4 {

	public static void main(String[] args) {
//	 Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik za dva prosledjena broja.
//	Brojevi su ulazni parametri funkcije. U gravnom programu pozvati nekoliko puta funkciju
//	sa razlicitim prosledjenim vrednostima. 



		operacije(80, 8);
		operacije(80, 8);
		operacije(50, 5);
		operacije(20, 2);
		operacije(45, 5);
		
	}
	public static void operacije(int a, int b) {
		System.out.println("Zbir: " + (a + b));
		System.out.println("Razlika: " + (a - b));
		System.out.println("Proizvod: " + (a * b));
		System.out.println("Kolicnik: " + (a / b));	
	}
}
