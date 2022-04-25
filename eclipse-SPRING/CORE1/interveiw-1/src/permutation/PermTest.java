package permutation;

public class PermTest {
	/**
	 * permutation function
	 * 
	 * @param str string to calculate permutation for
	 * @param l   starting index
	 * @param r   end index
	 */
	private void perm(String str, int l, int r) {
		if (l == r)
			System.out.print(str + "  ");
		else {
			for (int i = l; i <= r; i++) {
				str = swapping(str, l, i);
				perm(str, l + 1, r);
				str = swapping(str, l, i);
			}
		}
	}

	/**
	 * Swap Characters at position
	 * 
	 * @param a string value
	 * @param i position 1
	 * @param j position 2
	 * @return swapped string
	 */
	public String swapping(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	public static void main(String[] args) {
		String str = "123";
		int n = str.length();
		PermTest permutation = new PermTest();
		permutation.perm(str, 0, n - 1);
	}

}

// This code is contributed by Mihir Joshi
