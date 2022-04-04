package simpli.learn;

public class CallByValue {
int val = 200;
int operation(int val) {
val = (val*10)/100;
return val;

}
public static void main(String[] args) {
	CallByValue cBy = new CallByValue();
	System.out.println("value " +cBy.val);
	cBy.operation(10);
	System.out.println("After operation value is "+cBy.val);
}
}