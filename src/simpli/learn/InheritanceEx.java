package simpli.learn;
class Bike1{
		int speed=60;
		
	}
	class R150 extends Bike1{
		void speedR150() {
			System.out.println(speed + 40);
		}
	}
	public class InheritanceEx {
	public static void main(String args[]) {
		R150 r = new R150();
		r.speedR150();
	}
	}

