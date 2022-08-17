package p16_08_2022;

public class Zadatak3 {

	public static void main(String[] args) {
		Auto a = new Auto();
		
		a.vozac = "Nevena Grujic";
		a.marka = "BMW";
		a.brVrata = 5;
		a.potrosnja = 6.2;
		a.brzina = 250;
		
		a.print();
		boolean x = a.merac(80); // moze u uslovu
	}

}
