package predicate;

import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> p1 = String::isEmpty;
		Predicate<String> p2 = a -> a.isEmpty();
		
		System.out.println(p1.test("hey"));
		System.out.println(p2.test(""));
	}

}
