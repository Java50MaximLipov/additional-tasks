import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IsAnagramTest {

	@Test
	void isAnagramTest() {
		String originalString1 = "anagram";
		String anagramString1 = "anagrama";
		assertFalse(isAnagram(originalString1, anagramString1));
		String originalString2 = "anagram";
		String anagramString2 = "an4gram";
		assertFalse(isAnagram(originalString2, anagramString2));
		String originalString3 = "anagram";
		String anagramString3 = "anagram";
		assertTrue(isAnagram(originalString3, anagramString3));
		String originalString4 = "Listen";
		String anagramString4 = "Silent";
		assertTrue(isAnagram(originalString4, anagramString4));
	}

	public static boolean isAnagram(String sourceWord, String targetWord) {
		if (sourceWord.length() != targetWord.length()) {
			return false;
		}

		int[] alphabet = new int[26];
		boolean res = true;
		sourceWord = sourceWord.toLowerCase();
		targetWord = targetWord.toLowerCase();

		for (int i = 0; i < sourceWord.length(); i++) {
			char sourceChar = sourceWord.charAt(i);
			char targetChar = targetWord.charAt(i);
			if (!Character.isLetter(sourceChar) || !Character.isLetter(targetChar)) {
				System.out.println("Invalid word found.");
				return false;
			}
			alphabet[sourceChar - 'a']++;
			alphabet[targetChar - 'a']--;
		}

		for (int i = 1; i < alphabet.length; i++) {
			if (alphabet[i] != 0) {
				res = false;
			}
		}
		return res;
	}

}
