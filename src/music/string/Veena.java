package music.string;
//Write an interface called Playable with a method void play();
//Let the interface be placed in a package called music
//Write a class Veena which implements Playable interface. Let this class be placed in music.string->package
//Write a class Saxophone which implements Playable interface. Let this class be placed in music.wind->package
//Write a Test class in a package called live 
//1. Create an instance of Veena and call play
//2.Create an instance of Saxophone and call play
//3.Place the above instances in an obj of Playable and call play()

import music.com.Playable;

public class Veena implements Playable {
	public void play() {
		System.out.println("Call veena play");
	   }
		
	}



