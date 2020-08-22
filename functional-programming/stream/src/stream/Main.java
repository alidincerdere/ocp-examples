package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<String> s1 = Stream.empty();
		Stream<Integer> s2 = Stream.of(1);
		Stream<Integer> s3 = Stream.of(1,2,3);
		
		List<String> list1 = Arrays.asList("ali", "dincer", "dere");
		
		Stream<String> s4 = list1.stream();
		Stream<String> s5 = list1.parallelStream();
		

		//count
		System.out.println(s5.count());
		
		//min max
		Optional<String> smin = s4.min((e1,e2) -> e1.length() - e2.length());
		
		smin.ifPresent(System.out::println);
		
		Stream<String> s6 = Stream.of("aslan","kaplan", "kedi", "leopar" );
		
		s6.findFirst().ifPresent(System.out::println);
		
		
		Stream<String> s7 = Stream.of("maymun", "goril", "şempanze");
		
		//System.out.println(s7.anyMatch(x-> x.length() == 6));
		//System.out.println(s7.allMatch(x-> x.length() == 6));
		System.out.println(s7.noneMatch(x-> x.length() == 6));
		
		Stream<String> s8 = Stream.of("ev", "araba", "yazlık");
		
		s8.forEach(System.out::println);
		
		
		Stream<String> s9 = Stream.of("W", "o", "l",  "f");
		
		String s9Reduced =  s9.reduce("", (s,c)-> s + c);
		
		System.out.println(s9Reduced);
		
		
		Stream<Integer> s10 = Stream.of(3, 5, 7);
		
		System.out.println(s10.reduce(1, (s,c)-> s*c));
		
		
		
	}

}
