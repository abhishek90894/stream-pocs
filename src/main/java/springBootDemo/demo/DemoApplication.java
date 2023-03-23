package springBootDemo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("abhishek srivastava");
		System.out.println("this is git demo ");
		System.out.println("this is second method");
    // create a list and sort the element of the list
		List<Integer> l1 = Arrays.asList(4,5,2,7,8,9,3);
		List<Integer> l2 =l1.stream().sorted().collect(Collectors.toList());
		System.out.println(l2);

		// find the  no. repeated in the list

		List<Integer> l3 = List.of(2,2,2,3,4,5,4,6,7,8,8,8,9,3,3);
		 Set<Integer> l4 = l3.stream().filter(e-> Collections.frequency(l3,e)>1).collect(Collectors.toSet());
		System.out.println(l4);
	}

}
