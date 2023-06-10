import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdditionalTaskTest {

	@Test
	void test() {
		int[] array1 = { 1, 3, 3, 2, 8, 8, 8, 5, 6, 6 };
		assertEquals(3, maxSubsequenceLength(array1));
		int[] array2 = { 0, 3, 2, 5, 7, 4, 5, 4, 4, 3, 2, 2, 2 };
		assertEquals(3, maxSubsequenceLength(array2));
		int[] array3 = null;
		assertEquals(0, maxSubsequenceLength(array3));
		int[] array4 = {};
		assertEquals(0, maxSubsequenceLength(array4));
		int[] array5 = { 0, 3, 45, 6, 2, 6, 7, 2 };
		assertEquals(1, maxSubsequenceLength(array5));
	}

	public static int maxSubsequenceLength(int[] arr) {
		int res = 1;
		int tempRes = 1;
		if (arr == null || arr.length == 0) {
			res = 0;
		} else {
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] == arr[i - 1]) {
					tempRes++;
					res = Math.max(res, tempRes);
				} else {
					tempRes = 1;
				}
			}
		}
		return res;
	}

	@Test
	void toBinaryStrTest() {
		int number1 = 121;
		int number2 = 56;
		int number3 = 254;
		int number4 = 4599045;

		assertEquals(Integer.toBinaryString(number1), toBinaryStr(number1));
		assertEquals(Integer.toBinaryString(number2), toBinaryStr(number2));
		assertEquals(Integer.toBinaryString(number3), toBinaryStr(number3));
		assertEquals(Integer.toBinaryString(number4), toBinaryStr(number4));
	}

	public static String toBinaryStr(int number) {
		String res = "";
		do {
			res = number % 2 + res;
			number /= 2;
		} while (number > 0);
		return res;
	}
}
