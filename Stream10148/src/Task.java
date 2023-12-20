import java.util.ArrayList;

public class Task {

	public static void main(String[] args) {
		ArrayList<Integer> salaries = new ArrayList<>();
		salaries.add(55000);
		salaries.add(88000);
		salaries.add(45000);
		salaries.add(65000);
		salaries.add(45000);
		
		double totalSalary = salaries
				.stream()
				.filter((salary) -> salary > 50000)
				.map((salary) -> salary + salary * 0.1)
				.reduce(0.0, (salary1,salary2)->salary1+salary2);
		
		System.out.println(totalSalary);

	}

}
