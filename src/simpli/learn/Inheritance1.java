package simpli.learn;
class Scooty{
		int speed=200;
	}
	class R16 extends Scooty {
		int speed=100;

		void speedR15() {
			System.out.println(speed+150);
		}
		
		R16(){
			System.out.println("This is r15 bike:");
		}
	}

	class YamahanewR16 extends R16{
	int speed=300;
		
		void speedR15() {
			super.speedR15();
			System.out.println(speed+200);
		}
		
		public YamahanewR16() {
			System.out.println("yamahar15 new");
		}
	}
	public class Inheritance1 {
		public static void main(String[] args) {
			YamahanewR16 r15=new YamahanewR16();
			//r15.speedR15();
		}
}
