package optional;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Optional<Double> avg = average(90, 100);
		
		avg.ifPresent(System.out::println);

	}
	
	public static Optional<Double> average(int... scores) {
		
		if(scores.length == 0) return Optional.empty();
		
		int sum = 0;
		
		for(int score : scores) {
			sum += score;
		}
		return Optional.of((double) sum/scores.length);
		
	}

}
