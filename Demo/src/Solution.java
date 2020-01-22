import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		StringBuffer sb = new StringBuffer(A);
		StringBuffer newStr = sb.reverse();
		System.out.println(newStr);
		if (A.equals(newStr))

			System.out.println("Yes");
		else
			System.out.println("No");
		/* Enter your code here. Print output to STDOUT. */
		sc.close();
	}
}
