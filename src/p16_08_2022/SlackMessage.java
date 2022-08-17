package p16_08_2022;

public class SlackMessage {
	public String tekstPoruke;
	public String posiljalac;
	public String tajming;
	
	public void stampaj() {
		System.out.println("Tekst poruke: " + this.tekstPoruke);
		System.out.println("Posiljalac: " + this.posiljalac);
		System.out.println("Tajming: " + this.tajming);
	}
}
