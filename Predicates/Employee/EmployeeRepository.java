package Java8;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeRepository {
	
	public static List<Employee> filterEmployee (List<Employee> employee,Predicate<Employee> predicate){
		
		return employee
				.stream()
				.filter(predicate)
				.collect(Collectors.toList());
	}

}
