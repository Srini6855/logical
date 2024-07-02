package org.logical;

public class Palindrome {
	public static void main(String[] args) {
		long l = 234560087654123480l;
		String a = Long.toString(l);
		String replaceAll = a.replaceAll("0", "");
		System.out.println(replaceAll);

	}

}
