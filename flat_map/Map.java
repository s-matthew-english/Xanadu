import java.util.*;
import java.util.stream.Stream;

public class Map {
	public static void main(String... args) {

		// Creating a list of Strings
		List<String> list = Arrays.asList("666", "13", "007");

		//Using Stream flatMap(Function mapper)
		list.stream().flatMap(item -> Stream.of(item)).forEach(System.out::println);
	}
}