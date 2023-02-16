package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8Predicate_stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		List<String> names  = Arrays.asList("ram","shayam","baburao","kachraseth","tiwariseth","start-garage","anuradha","rimaji","shushmaji");
		
		List<String> lastName = Arrays.asList("Shah", "Trevadiya", "Patel", "Rathod", "Mehta");
		
		
		Predicate<Integer> greaterThan5 = x->x>5;
		Predicate<Integer> lessThen8 = x->x<8;
		
		Predicate<String> namesWithS = x->x.startsWith("s");
		Predicate<String> namesWithR = x->x.startsWith("r");
		
		System.out.println("<-----------------filtered Data And----------------------------->");
		System.out.println();
		List<Integer> collect = list
					.stream()
					.filter(greaterThan5.and(lessThen8))
					.collect(Collectors.toList());
		System.out.println(collect);
		System.out.println();
		System.out.println("<-----------------filtered Data OR------------------------------>");
		System.out.println();
		List<String> filteredName = names
				.stream()
				.filter(namesWithS.or(namesWithR))
				.collect(Collectors.toList());
		System.out.println(filteredName);
		System.out.println();
		System.out.println("<------------------Filterd Data negetion------------------------>");
		System.out.println();
		List<String> notStartWithR = names
				.stream()
				.filter(namesWithR.negate())
				.collect(Collectors.toList());
		System.out.println(notStartWithR);
		System.out.println();
		System.out.println("<------------------Filterd Data CustomFilter------------------------>");
		System.out.println();
		System.out.println(StringProcessor.filter(lastName, x->x.startsWith("S") || x.startsWith("T")));
		System.out.println();
	
	}

}
