import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfletter {

	static Map<Character, Integer> m = new HashMap<Character, Integer>();
	static int freq = 1;

	public static void frequencyOfLetterInWord(String s) {

		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(0) == s.charAt(j) && i != j) {
					freq++;
				} else
					freq = 1;

			}
			
		}
		

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String input = sc.next();
		frequencyOfLetterInWord(input);

		for (Integer i : m.values()) {
			System.out.println(i);
		}
		sc.close();
	}

}
