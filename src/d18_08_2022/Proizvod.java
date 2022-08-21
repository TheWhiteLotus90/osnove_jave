package d18_08_2022;

public class Proizvod {
//	naziv proizvoda (String)
////cenu proizvoda (double)
////težinu proizvoda u gramima. (double)
	
	private String naziv;
	private double cena;
	private double tezina;
	
	public void stampaj() {
		System.out.println("{{" +this.naziv+ "}} " + " {{" +this.cena+ "}} " + " {{" +this.tezina+ "}}");
	}
	
	
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}
	public void setTezina(double tezina) {
		this.tezina = tezina;
	}
	

	public void povecajCenu(double povecanje) {
		this.cena = this.cena + povecanje;
	}

	public double vratiCenuSaPopustom(double popust) {
		double novaCena = this.cena - popust;
		return novaCena;
	}

	public int postarina() {
		if (this.tezina <= 100) {
			return 200;
		} else if (this.tezina > 100 && this.tezina <= 500) {
			return 400;
		}
		return 1000;
	}
}
