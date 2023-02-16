package Java8;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringProcessor {
	public static List<String> filter(List<String>  list, Predicate<String> predicate){
		return list.stream().filter(predicate).collect(Collectors.toList());
	}
}
