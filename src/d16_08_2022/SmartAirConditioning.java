package d16_08_2022;

public class SmartAirConditioning {
	
	public String marka;
	public double temperatura;
	public String mod;

	public void stampa() {
		System.out.println("Marka: " + this.marka);
		System.out.println("Temperatura: " + this.temperatura);
		System.out.println("Mod: " + this.mod);
	}

	public String test(double tNapolju) {
			if (tNapolju > this.temperatura) {
			return "da";
			} else {
			return "ne";
	}
			
	}
}
