package org.logical;

public class Uppercase {
	public static void main(String[] args) {
		String input = "Srinivasu is a Automation Engineer";
		String rev = "";
		String[] split = input.split(" ");
		for (String string : split) {
			String s5 = "";
			for (int i = string.length() - 1; i >= 0; i--) {
				char charAt = input.charAt(i);
				s5 = s5 + charAt;
			}
			rev = rev + s5;
		}
		System.out.println(rev);
	}

}
