package PA4;

public class StringStuff {
	public static boolean isPalindrome(String str) {
		int a = 0;
		int b = str.length() - 1;
		while (a < b) {
			if (str.charAt(a) != str.charAt(b)) {
				return false;
			}
			a++;
			b--;
		}
		return true;
	}
	public static String longestPalindromeWithin(String str) {
		String longestSub = "";
		return longestSub;
	}
	public static boolean containsAllDigits(String str) {
		boolean[] contains09 = {false, false, false, false, false, false, false, false, false, false};
		for(int i = 0; i < str.length(); i++) {
			int a = str.charAt(i);
			if (a >= 48 && a <= 57) {
				char b = (char)a;
				int c = Character.getNumericValue(b);
				contains09[c] = true;
			}
		}
		for(int i = 0; i < 10; i++) {
			if (!contains09[i]) {
				return false;
			}
		}
		return true;
	}
	public static String replaceAll(String text, String key, String replacement) {
		String[] a = text.split(key);
		StringBuilder out = new StringBuilder();
		for(int i = 0; i <= a.length - 1; i++) {
			out.append(a[i]).append(replacement);
		}
		return out.toString();
	}
	/*public static String runLengthEncode(String str) {
		return "";
	}*/
}
