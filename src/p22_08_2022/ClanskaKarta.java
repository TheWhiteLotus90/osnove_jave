package p22_08_2022;

public class ClanskaKarta {
//	popust (u rasponu od 5 do 10 %)
//	broj kartice (npr: 9329-0239)
//	gettere i setter 
//	konstuktore

	private int popust;
	private String brojKartice;
	
	public ClanskaKarta() {
		
	}
	public ClanskaKarta(int popust, String brojKartice) {
		this.popust = popust;
		this.brojKartice = brojKartice;
	}
	
	
	public int getPopust() {
		return popust;
	}
	public void setPopust(int popust) {
		this.popust = popust;
	}
	public String getBrojKartice() {
		return brojKartice;
	}
	public void setBrojKartice(String brojKartice) {
		this.brojKartice = brojKartice;
	}

}
