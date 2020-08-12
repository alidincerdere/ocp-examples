import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> myMap = new HashMap();
		
		BiConsumer<Integer, String> bc1 = myMap::put;
		
		BiConsumer<Integer, String> bc2 = (k,v) -> myMap.put(k,v);
		
		
		bc1.accept(1,"chicken");
		bc2.accept(2, "chick");
		
		System.out.println(myMap);

	}

}
