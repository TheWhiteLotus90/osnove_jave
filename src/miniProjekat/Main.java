package miniProjekat;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Ucitati podatke za igrace
//		Kreirajte objekat klase XandOGame 
//		Startujte igru, tada je na potezu igrac X
//		Saveti za dobar zadatak
//		Igra treba da traje dok (while petlja)
//		nije kraj igre - imamo metodu za to
//		Ili dok ne dobijemo pobednika
//		U petlji
//		Trazimo od aktuelnog igraca da unese potez
//		Ukoliko je pozicija validna i ako je to slobodno mesto, igramo potez
//		Prebacujemo red na drugog igraca
//		Stampamo tablu
//		Ukoliko nije validna pozicija ili nije slobodno mesto stampamo poruku "You enter invalid position."
//		Nakon zavrsetka igre, racunamo skor i stampamo rezultat igre i podatke za igrace


		Scanner s = new Scanner(System.in);
		
		Player one = new Player("Vladimir Minic");
		Player two = new Player("Milan Jovanovic");
		XandOGame game = new XandOGame(one, two);
		
		game.startGame();

		game.startGame();


		while(!game.isGameOver() && !game.isWinnerX() && !game.isWinnerO()) {


		System.out.println("Make a move: ");	
		int pozicija = s.nextInt();

		if(game.isValidMove(pozicija) && game.isFieldFree(game.getTable(), pozicija)) {
			game.makeAMove(pozicija);
			game.playNext();
			game.print();
			}
		else {
			System.out.println("You enter invalid position.");
		}
			}
		int score = game.gameScore();

	  if(score == 1) {
		  System.out.println("Winner is X.");
	  }
	  else if(score == 2) {
		  System.out.println("Winner is O.");
	  }
	  else {
		  System.out.println("There is no winner.");
	  }	
	}

}
