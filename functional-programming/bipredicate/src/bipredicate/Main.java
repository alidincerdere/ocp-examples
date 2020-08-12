package bipredicate;

import java.util.function.BiPredicate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiPredicate<String, String> bp1 = String::startsWith;
		BiPredicate<String, String> bp2 = (a,b) -> a.startsWith(b);
		
		System.out.println(bp1.test("complete", "com"));
		System.out.println(bp2.test("complete", "com"));

	}

}
