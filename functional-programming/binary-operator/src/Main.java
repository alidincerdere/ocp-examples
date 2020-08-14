import java.util.function.BinaryOperator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryOperator<String> bo1 = String::concat;
		
		BinaryOperator<String> bo2 = (x,y) -> x.concat(y);
		
		System.out.println(bo1.apply("hey ", "naber"));
		
		System.out.println(bo2.apply("nasıl ", "gidiyor"));
		
		
	}

}
