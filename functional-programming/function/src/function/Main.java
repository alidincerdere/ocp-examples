package function;

import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<String, Integer> f1 = String::length;
		
		Function<String, Integer> f2 = a -> a.length();
		
		System.out.println(f1.apply("hello"));
		System.out.println(f2.apply("hey"));

	}

}
