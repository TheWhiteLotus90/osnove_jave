package p26_08_2022;

public class Vozilo {
	protected String registracija;
	protected String marka;
	protected String brzina;
	protected String kubikaza;	
	protected int maxBrzina;
	
	
	
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getRegistracija() {
		return registracija;
	}
	public void setRegistracija(String registracija) {
		this.registracija = registracija;
	}
	public String getBrzina() {
		return brzina;
	}
	public void setBrzina(String brzina) {
		this.brzina = brzina;
	}
	public String getKubikaza() {
		return kubikaza;
	}
	public void setKubikaza(String kubikaza) {
		this.kubikaza = kubikaza;
	}
	public int getMaxBrzina() {
		return maxBrzina;
	}
	public void setMaxBrzina(int maxBrzina) {
		this.maxBrzina = maxBrzina;
	}

	
	public void print() {
		System.out.println("Registracija: ");
		System.out.println("Brzina: ");
		System.out.println("");
		System.out.println("");

	}
}
