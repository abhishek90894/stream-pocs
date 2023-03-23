package springBootDemo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
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
	}

}
