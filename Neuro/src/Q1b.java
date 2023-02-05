import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q1b {

	public static void main(String[] args) {

		List<String> wordList = Arrays.asList("abc", "an", "", "apple", "bcd", "", "jk");

		int count = wordList.stream().filter(word -> (word.startsWith("a") || word.isEmpty()))
				.collect(Collectors.toList()).size();

		System.out.println(count);

	}

}
