package p19_08_2022;

public class Radnik {
	private String jmbg;
	private String punoIme;
	private int deca;
	private int sss;
	private int radniStaz;
	
	public Radnik(String jmbg) {
		this.jmbg = jmbg;
	}
	
	public Radnik(String jmbg,
				  String punoIme,
				  int deca,
				  int sss,
				  int radniStaz) {
		this.jmbg = jmbg;
		this.punoIme = punoIme;
		this.deca = deca;
		this.sss = sss;
		this.radniStaz = radniStaz;
	}
	
	
	public String getJmbg() {
		return this.jmbg;
	}
	
	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}
	public String getPunoIme() {
		return this.punoIme;
	}
//	setPunoIme(String value)
	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}
	
	public int getDeca() {
		return this.deca;
	}
	
	public void setDeca(int deca) {
		this.deca = deca;
	}
	
	public int getSss() {
		return this.sss;
	}
	
	public void setSss(int sss) {
		this.sss = sss;
	}
	
	public int getRadniStaz() {
		return this.radniStaz;
	}
	
	public void setRadniStaz(int radniStaz) {
		this.radniStaz = radniStaz;
	}
}
