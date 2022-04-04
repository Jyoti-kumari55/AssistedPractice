package simpli.learn;

class Car1{
	int speed=250;
	
}
class Nano extends Car1{
	int speedNano = 100;
	void speedNano() {
		System.out.println("Speed of Nano " + (speed-100));
	}
}
class Scorpio extends Nano{
	void speedScor() {
		System.out.println("Speed of Sacorpio "+(speed + speedNano - 100));
	}
}
public class MultiLevelInheri {
	public static void main(String []agrs) {
		Nano n = new Nano();
		n.speedNano();
		
		Scorpio s = new Scorpio();
		s.speedScor();
	}
	
}

