package p15_08_2022;

public class Predavanje2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int z = sumiraj(10, 20);
	}
// void - nemamo povratnu vrednost
//	int, double, sString, char moze da budu umesto void
	public static int sumiraj(int a, int b) {
		int zbir = a + b;
//		System.out.println("Suma " + zbir);
		return zbir;
//		a moze i return = a + b;
	}
	
}
