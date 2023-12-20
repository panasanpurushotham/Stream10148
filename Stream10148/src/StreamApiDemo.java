import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> salaries = new ArrayList<>();
		salaries.add(55000);
		salaries.add(88000);
		salaries.add(45000);
		salaries.add(65000);
		salaries.add(45000);
		
		Stream<Integer> stream = salaries.stream();
		
		Predicate<Integer> predicate= (salary) -> salary > 45000;
		
		Stream filterStream= stream.filter(predicate);
		
		List<Integer> filteredSalaries = filterStream.toList();
		
		System.out.println(filteredSalaries);
		
		System.out.println("===========");
		
	    
		List<Integer> filteredSalaries2 = salaries
				.stream()
				.filter((salary) -> salary > 45000)
				.toList();
		
		System.out.println(filteredSalaries2);
		

	}

}
