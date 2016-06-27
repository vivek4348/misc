import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "Vivek", 30.1d);
		
		Employee e2 = e1;
		
		Set<Employee> employeeSet = new HashSet<Employee>();
		employeeSet.add(e1);
		employeeSet.add(e2);
		
		System.out.println(employeeSet);
		
		
		LinkedHashSet<Employee> linkedEmployeeSet = new LinkedHashSet<Employee>();
		linkedEmployeeSet.add(e1);
		linkedEmployeeSet.add(e2);
		
		System.out.println();
		
		
		/*Set<String> stringSet = new HashSet<String>();
		stringSet.add("Vivek");
		stringSet.add("Vivek");
		stringSet.add("Anan");
		
		System.out.println(stringSet);*/
		
	}
}
