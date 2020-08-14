import java.util.function.UnaryOperator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UnaryOperator<String> uo = String::toUpperCase;
		
		UnaryOperator<String> uo2 = x -> x.toUpperCase();
	
		System.out.println(uo.apply("hey"));
		System.out.println(uo2.apply("hey"));

	}

}
