import java.util.ArrayList;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ReduceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> salaries = new ArrayList<>();
		salaries.add(55000);
		salaries.add(88000);
		salaries.add(45000);
		salaries.add(65000);
		salaries.add(45000);
		
		System.out.println(salaries);
		
		Stream<Integer> stream = salaries.stream();
		
		BinaryOperator<Integer> binaryOperator = (salary1, salary2) -> salary1 + salary2;
		
		int totalSalary = stream.reduce(2,binaryOperator);
		System.out.println(totalSalary);
		
		System.out.println("=========================");
		
		int totalSalary2 = salaries.stream().reduce(0,(a,b)->a+b);
		System.out.println(totalSalary2);
		
		

	}

}
