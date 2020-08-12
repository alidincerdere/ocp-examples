package bifunction;

import java.util.function.BiFunction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiFunction<String, String, String> bf1 = String::concat;
		
		BiFunction<String, String, String> bf2 = (string, toadd) -> string.concat(toadd);
		
		System.out.println(bf1.apply("merhaba ", "arkadaşlar"));
		System.out.println(bf2.apply("nasılsınız ", "iyimisiniz"));
		
	}

}
