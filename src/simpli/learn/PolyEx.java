package simpli.learn;



	class ArgEx{
		void args() {
			System.out.println("no argument");
		}
		
		void args(int a,int b) {
			System.out.println("2 argument of int type");
		}
		void args(double a,double b) {
			System.out.println("2 args of double type");
		}
	}

	public class PolyEx {
	public static void main(String[] args) {
		ArgEx ex=new ArgEx();
		ex.args(4,5);
		ex.args();
		ex.args(10.0,20);
		
	}
}
