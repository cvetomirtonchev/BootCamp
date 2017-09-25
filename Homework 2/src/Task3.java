
public class Task3 {
	private static int i = 0;

	public static void main(String args[]) {
		System.out.println(reverseMe("Tsvetomir"));
	}

	static String reverseMe(String text) {
		if (text.length() == 0)
			return "";
		return text.charAt(text.length() - 1) + reverseMe(text.substring(0, text.length() - 1));
	}
}
