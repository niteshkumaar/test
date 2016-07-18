package java3.com.util;

import java.util.HashMap;
import java.util.Map;

import java3.com.pojo.Employee;

public class HashMapInternalWorkingTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee("Nitesh", "Kumar");
		Employee emp2 = new Employee("Rajesh", "Kumar");
		Employee emp3 = new Employee("Suresh", "Kumar");
		Employee emp4 = new Employee("Mahesh", "Kumar");
		Employee emp5 = new Employee("Sachin", "Kumar");
		Map<Employee, String> empMap = new HashMap<>();
		empMap.put(emp1, "Nitesh");
		empMap.put(emp2, "Rajesh");
		empMap.put(emp3, "Suresh");
		empMap.put(emp4, "Mahesh");
		empMap.put(emp5, "Sachin");

		System.out.println(empMap.get(emp2));
	}

}
