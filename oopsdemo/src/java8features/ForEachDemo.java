package java8features;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {

	public static void main(String[] args) {
		 List<String> languages=new ArrayList<String>(); // declare ArrayList
	       
	        //add elements to List
	        languages.add("Java");
	        languages.add("Python");
	        languages.add("C#");
	        languages.add("Scala");
	        languages.add("Ruby");
	        languages.add("C++");
	       
	        System.out.println("********** Programming Languages *************");
	        languages.forEach(i -> System.out.println(i));//lambda exp
	       
	        System.out.println("********** Print Elements using Method Reference*********");
	        languages.forEach(System.out::println);
	       
	        //  i -- input parameter  --left hand side of lambda operator
	        // System.out.println(i) -- right hand side is method body

	}

}
