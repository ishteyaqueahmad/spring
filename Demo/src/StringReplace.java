import java.util.Scanner;

public class StringReplace {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:-");
		String in = sc.nextLine();

		System.out.println("Enter string to be replaced:");
		String search = sc.nextLine();

		System.out.println("Entered String:-" + in);
		System.out.println("search " + search);
		System.out.println("New replaced String: " + stringCount(in, search));
		sc.close();
	}

	public static String stringCount(String input, String search) {
		String[] str = input.split(" ");

		System.out.println(str.length);
		return null;
	}
}
