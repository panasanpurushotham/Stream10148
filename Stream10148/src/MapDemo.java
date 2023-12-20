import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class MapDemo {

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

		Function<Integer, Integer> function = salary -> salary + 5000;

		List<Integer> updatedSalaries = stream.map(function).toList();

		System.out.println(updatedSalaries);

		System.out.println("=========================");

		List<Integer> updatedSalaries2 = salaries
				.stream()
				.map((salary) -> salary + 2000).toList();
		System.out.println(updatedSalaries2);

	}

}
