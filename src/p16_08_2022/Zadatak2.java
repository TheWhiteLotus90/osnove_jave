package p16_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
//	 Krairti klasu SlackMessage koja ima:
//		tekst poruke
//		ime i prezime osobe koja je stavila poruku
//		datum i vreme kad je poslata poruka (npr: 26.08.2021 18:55)
//		U glavnom programu kreirati 2 slack poruke sa proizvoljnim podacima
//		i ostampati obe poruke u formatu:
//		[ime i prezime osobe] - [kad je poslata]
//		[Tekst poruke]
		
//	Dopunite klasu SlackMessage metodom za stampu koja stampa podatke u formatu
//	koji je naveden iznad i u mainu pozovite metode nad objektima koje ste kreirali.


		SlackMessage prvaPoruka = new SlackMessage();
		prvaPoruka.tekstPoruke = "Does this work?";
		prvaPoruka.posiljalac = "Nevena";
		prvaPoruka.tajming = "26.08.2021. 18:55";
		
		
		SlackMessage drugaPoruka = new SlackMessage();
		drugaPoruka.tekstPoruke = "Working.";
		drugaPoruka.posiljalac = "Sandra";
		drugaPoruka.tajming = "26.08.2021. 18:58";
		
		prvaPoruka.stampaj();
		drugaPoruka.stampaj();
//		System.out.println(prvaPoruka.posiljalac + " - " + drugaPoruka.tajming);
//		System.out.println(prvaPoruka.tekstPoruke);
//		
//		System.out.println(drugaPoruka.posiljalac + " - " + drugaPoruka.tajming);
//		System.out.println(drugaPoruka.tekstPoruke);
//				
		

	}

}
