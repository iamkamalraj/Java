package OOPS;

class Boo{
	int coin=5;
	
	public void callingFunc(){
		System.out.println("Hello");
		System.out.println(coin);
	}
	
}

public class Basics1 {
	/*1960 B language was not structured
	then C came working on Procedural/functional Manner (POP)
	After that Objects came (OOP) which was used by java
	then c uses oop by making a new language called c with classes
	after that the name changed to C++
	class - virtual entity , object - real world entity (entity=>things)*/
	
	public static void main(String args[]) {
		Boo lame = new Boo();
		
		lame.coin=8;
		lame.callingFunc();
		
		Kamal friend = new Kamal();
		System.out.println(friend.Chocolate);
		friend.uiux();
	}
}


class Kamal{
	String Chocolate="Diary Milk";
	void uiux() {
		System.out.println("i know designing very well");
	}
}

