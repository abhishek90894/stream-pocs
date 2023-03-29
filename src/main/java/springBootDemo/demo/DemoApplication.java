package springBootDemo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.stream.Collectors;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args)
	{
//		SpringApplication.run(DemoApplication.class, args);
//		System.out.println("abhishek srivastava");
//		System.out.println("this is git demo ");
//		System.out.println("this is second method");
//    // create a list and sort the element of the list
//		List<Integer> l1 = Arrays.asList(4,5,2,7,8,9,3);
//		List<Integer> l2 =l1.stream().sorted().collect(Collectors.toList());
//		System.out.println(l2);
//
//		// find the  no. repeated in the list
//
//		List<Integer> l3 = List.of(2,2,2,3,4,5,4,6,7,8,8,8,9,3,3);
//		 Set<Integer> l4 = l3.stream().filter(e-> Collections.frequency(l3,e)>1).collect(Collectors.toSet());
//		System.out.println(l4);

		employee emp1 = new employee();
		emp1.setEmpId(101);
		emp1.setEmpName("abhishek srivastava");
		emp1.setSalary(50000);

		employee emp2 = new employee();
		emp2.setEmpId(101);
		emp2.setEmpName("abhi srivastava");
		emp2.setSalary(45000);

		employee emp3 = new employee();
		emp3.setEmpId(102);
		emp3.setEmpName("ankur srivastava");
		emp3.setSalary(52000);

		employee emp4 = new employee();
		emp4.setEmpId(103);
		emp4.setEmpName("ankit srivastava");
		emp4.setSalary(60000);

		List<employee> l1 = new ArrayList<>();
		l1.add(emp1);
		l1.add(emp2);
		l1.add(emp3);
		l1.add(emp4);

//		System.out.println(l1);

//		List<employee> even =     l1.stream().filter(e ->e.getEmpId()%2!=0).collect(Collectors.toList());
//		System.out.println(even);
//		List<employee> salary =  even.stream().filter(e->e.getSalary()>50000).collect(Collectors.toList());
//		System.out.println(salary);

		     List<employee> evenSal =l1.stream().filter(e->e.getEmpId()%2!=0).filter(e->e.getSalary()>48000).collect(Collectors.toList());
		System.out.println(evenSal);
	int sal	=l1.stream().mapToInt(e->e.getSalary()).sum();
		System.out.println(sal);


	}
	}


