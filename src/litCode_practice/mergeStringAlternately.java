package litCode_practice;

public class mergeStringAlternately {

//Merge alternate string
	static String mergeString(String word1, String word2) {
		StringBuilder str = new StringBuilder();

		int maxLength = Math.max(word1.length(), word2.length());

		for (int i = 0; i < maxLength; i++) {
			if (i < word1.length()) {
				str.append(word1.charAt(i));

			}
			if (i < word2.length()) {
				str.append(word2.charAt(i));

			}
		}

		return str.toString();

	}

	public static void main(String[] arg) {
		System.out.println(mergeString("abc", "pqr"));
		System.out.println(mergeString("ab", "pqrs"));
		System.out.println(mergeString("abcd", "pq"));
	}
}
