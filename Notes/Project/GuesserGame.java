package Project;

import java.util.Scanner;

class Guesser{
	Scanner sc = new Scanner(System.in);
	public int guessNum() {
		System.out.print("Guesser say a Number : ");
		int guessNum = sc.nextInt();
		return guessNum;
	}
}

class Player{
	Scanner sc = new Scanner(System.in);
	public int playerNum() {
		System.out.println("Player guess a Number");
		int playerNum = sc.nextInt();
		return playerNum;
	}
}
class Umpire{
	Guesser g = new Guesser();
	int numFromGuesser = g.guessNum();
	
	
	Player p1 = new Player();
	Player p2 = new Player();
	Player p3 = new Player();
	
	
	int numFromPlayer1 = p1.playerNum();
	int numFromPlayer2 = p2.playerNum();
	int numFromPlayer3 = p3.playerNum();
	
	public void compare() {
		if(numFromGuesser == numFromPlayer1 ) {
			if(numFromGuesser == numFromPlayer2 ) {
				if(numFromGuesser == numFromPlayer3) {
					System.out.println("The Winner is Player 1 , Player 2 and Player 3");
				} else {
					System.out.println("The Winner is Player 1 and Player 2");
				}
			} else if(numFromGuesser == numFromPlayer3 ) {
				System.out.println("The Winner is Player 1 and Player 3");
			} else {
				System.out.println("The Winner is Player 1");
			}
		}else if(numFromGuesser == numFromPlayer2 ) {
			if(numFromGuesser == numFromPlayer3 ) {
				System.out.println("The Winner is Player 2 and Player 3");
			}else {
				System.out.println("The Winner is Player 2");
			}
		} else if(numFromGuesser == numFromPlayer3 ) {
			System.out.println("The Winner is Player 3");
		} else {
			System.out.println("There is NO Winner");
		}
	}
}


public class GuesserGame {
	public static void main(String args[]) {
		Umpire u = new Umpire();
		u.compare();
	}

}
