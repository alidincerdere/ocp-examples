import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Consumer<String> c1 = System.out::println;
		Consumer<String> c2 = (a) -> System.out.println(a);
		
		c1.accept("hey");
		c2.accept("naber");
	}

}
