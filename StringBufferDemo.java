package javaassignment4;

public class StringBufferDemo
{
		public static String removeDuplicate(String input) {
		boolean character[] = new boolean[122];
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < input.length(); i++) {

		char test = input.charAt(i);
		if (!character[test]) {
		sb.append(test);
		character[test] = true;
		}
		}
		return sb.toString();
		}

		public static void main(String[] args) {

		String input = "Pallavi";
		String newString = removeDuplicate(input);
		System.out.println("String after removing duplicates :" + newString);

		}

		}
