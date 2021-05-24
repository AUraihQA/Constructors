package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {

	public static void main(String[] args) {
		
		// streams are good with lists
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		System.out.println(numbers);
		//numbers.stream().forEach(x -> System.out.println(x));
		
		List<Integer> squares = numbers.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println(squares);
		
		List<String> names = Arrays.asList("Bob", "John", "Steve");
	    List<String> result = names.stream() .filter(str -> str.startsWith("S")).collect(Collectors.toList());
	    System.out.println(result);
	    
	    List<Integer> even = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
	    System.out.println(even);
	}

}