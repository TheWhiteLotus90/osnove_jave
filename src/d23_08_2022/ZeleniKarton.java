package d23_08_2022;

public class ZeleniKarton {
//	ime i prezime studenta 
//	broj indeksa 
//	naziv predmeta
//	ime i prezime profesora
//	ocenu - od 5 do 10
//	gettere i settere
//	konstruktore
//	metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//	metodu stampaj koja stampa podatke u formatu:
//			(naziv predmeta) - (ocena)
//			Student: ime i prezime, broj indeksa
//			Profesor: ime i prezime
	
	private String student;
	private int brIndexa;
	private String predmet;
	private String profesor;
	private int ocena;
	
	
	public ZeleniKarton() {
		
	}
	public ZeleniKarton(String punoIme, int brIndexa, String predmet, String profesor, int ocena) {
		super();
		this.student = punoIme;
		this.brIndexa = brIndexa;
		this.predmet = predmet;
		this.profesor = profesor;
		this.ocena = ocena;
	}
	
	
	public String getPunoIme() {
		return student;
	}
	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	public void setPunoIme(String punoIme) {
		this.student = punoIme;
	}
	public int getBrIndexa() {
		return brIndexa;
	}
	public void setBrIndexa(int brIndexa) {
		this.brIndexa = brIndexa;
	}
	public String getPredmet() {
		return predmet;
	}
	public void setPredmet(String predmet) {
		this.predmet = predmet;
	}
	public String getProfesor() {
		return profesor;
	}
	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}
	public int getOcena() {
		return ocena;
	}
	
	public boolean polozenIliNe(){
		if(ocena > 5) {
			return true;
		}
		return false;
	}
	
	public void print() {
		System.out.println(this.predmet +" - "+ this.ocena);
		System.out.println("Student: "+ this.student +", " + this.brIndexa);
		System.out.println("Profesor: "+  this.profesor);
		System.out.println();
	}
}
