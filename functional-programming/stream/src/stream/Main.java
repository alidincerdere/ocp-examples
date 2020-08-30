package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
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
		
		
		Stream<String> s11 = Stream.of("w", "o", "l", "f");
		
		List<String> sList = s11.collect(Collectors.toList());
		
		System.out.println(sList.toString());
		
		
		//common intermediate operations:
		
		Stream<String> s12 = Stream.of("kedi", "köpek", "böcek");
		
		s12.filter(s->s.startsWith("k")).forEach(System.out::println);
		
		Stream<String> s13= Stream.of("ördek", "ördek", "tavuk", "ördek");
		
		s13.distinct().forEach(System.out::print);
		
		
		Stream<Integer> s14 = Stream.iterate(1, n->n+1);
		
		s14.skip(5).limit(3).forEach(System.out::println);
		
		
		Stream<String> s15 = Stream.of("selma", "zeynep", "zeliha", "dinçer");
		
		s15.map(String::length).forEach(System.out::print);
		
		Stream<Integer> s16 = Stream.of(1,6,3,12,5);
		
		s16.sorted().forEach(System.out::print);
		
		
		
		List<String> names = Arrays.asList("Ali", "Dinçer", "Dere", "Selma", "Zeynep", "Zeliha");
		
		names.stream().filter(n -> n.length() == 6).sorted().limit(2).forEach(System.out::println);
		
		
		//IntStream
		
		Stream<Integer> s17 = Stream.of(1,2,3,4);
		
		System.out.println(s17.mapToInt(x->x).sum());
		
		
		
		DoubleStream ds = DoubleStream.generate(Math::random);
		ds.limit(3).forEach(System.out::println);
		
		DoubleStream ds2 = DoubleStream.iterate(0.5, x-> x/2);
		
		ds2.limit(3).forEach(System.out::println);
		
		
		
		IntStream is = IntStream.iterate(1, x->x+1);
		
		is.limit(5).forEach(System.out::println);
		
		
		
		Stream<String> objStream = Stream.of("ali", "dincer", "dere");
		
		IntStream intStream = objStream.mapToInt(String::length);
		intStream.forEach(System.out::println);
		
		
		
		Stream<String> collectStream = Stream.of("ali","selma");
		
		System.out.println(collectStream.collect(Collectors.joining(",")));
		
		
		
		Stream<String> cStream = Stream.of("lions", "tigers", "bears");
		
		Map<Integer, String> map = cStream.collect(Collectors.toMap(String::length, k -> k, (x1, x2) -> x1 + "," + x2));
		System.out.println(map);
		
		List<String> animalList = Arrays.asList("lions", "tigers", "bears");
		
		Map<Integer, List<String>> animalMap = animalList.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(animalMap);
		
		
		Map<Integer, Long> cMap = animalList.stream().collect(Collectors.groupingBy(String::length,  Collectors.counting()));
		System.out.println(cMap);
		
		
	}

}
