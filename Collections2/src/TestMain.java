import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestMain {

	public static void main(String[] args) {
		List<Employee> employees = new LinkedList<>();
		
		Department d1 = new Department("ROAM");
		Department d2 = new Department("Ailis");
		Department d3 = new Department("Support");
		
		Employee e1 = new Employee(1, "Vivek", 30.1d);		
		Employee e2 = new Employee(2, "Sushmita", 30.1d);		
		Employee e3 = new Employee(3, "Viji", 30.1d);		
		Employee e4 = new Employee(4, "Maria", 30.1d);		
		Employee e5 = new Employee(5, "Jeremiah", 30.1d);		
		Employee e6 = new Employee(6, "Asif", 30.1d);
		
		e1.setDept(d1);
		e2.setDept(d2);
		e3.setDept(d2);
		e4.setDept(d1);
		e5.setDept(d3);
		e6.setDept(d2);
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		employees.add(e6);
		
		 Map<Department, List<Employee>> byDept
         = employees.stream()
                    .collect(Collectors.groupingBy(Employee::getDept));
		 byDept.forEach((k, v) -> System.out.println(k + ": " + v));
		
		
		
		
		
	}
}
