import java.util.Scanner;
public class Operators {
	public int add(int a, int b) {
		Scanner sc = new Scanner(System.in);
		return a+b;
	}
	
	public int multiply(int a, int b) {
		return a*b;
	}
	
	public int subtract(int a, int b) {
		return a-b;
	}
	
	public String divide(int a, int b) {
		if(b==0) {
			return "infinity";
		}
		else {
			return Integer.toString(a/b);
		}
	}
}
