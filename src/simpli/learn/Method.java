package simpli.learn;

public class Method {
	//Method created:
public int Multiply (int a,int b) {
	int z = a*b;
	return z;
	
}
public static void main(String[] args) {
	Method method = new Method();
	int ans = method.Multiply(10, 3);
	System.out.println("Mutliply " +ans);
}

}
