package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(101, "Nimit", "July", "2022");
		Employee e2 = new Employee(102, "Deep", "January", "2022");
		Employee e3 = new Employee(103, "Ram", "Auguest", "2023");
		Employee e4 = new Employee(104, "Vraj", "January", "2023");
		Employee e5 = new Employee(105, "Bhavin", "Auguest", "2020");

		List<Employee> employee =  Arrays.asList(e1,e2,e3,e4,e5);
		
		
		System.out.println("Filtering the Employess whoes Joining Month Starts with `j`");
		List<Employee> result = EmployeeRepository.filterEmployee(employee, x->x.getJoiningMonth().startsWith("J"));
		System.out.println();
		System.out.println(result);
		System.out.println();
		System.out.println("New Joininer :");
		List<Employee> newJoinie = EmployeeRepository.filterEmployee(employee, isNewJoiner());
		System.out.println(newJoinie);
		

	}
	
	public static Predicate<Employee> isNewJoiner(){
		return n->(n.getJoiningMonth().equalsIgnoreCase("Auguest") && n.getJoiningYear().equalsIgnoreCase("2023"));
	}

}
