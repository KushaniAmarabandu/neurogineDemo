import java.util.ArrayList;
import java.util.List;

public class Q1a {

	public static void main(String[] args) {

		String word = "kushani";
		List<String> strArr = convertToStringList(word);

		strArr.stream().map(character -> character.toUpperCase()+',')
		.forEach(character -> System.out.print(character));
	}

	private static List<String> convertToStringList(String word) {
		List<String> strArr = new ArrayList<>();
		for (char string : word.toCharArray()) {
			strArr.add(String.valueOf(string));
		}
		return strArr;
	}

}
