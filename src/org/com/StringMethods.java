package org.com;

public class StringMethods {
	
	public static void main(String[] args) {
		String s = "Java";
		String s1 = "java";
		String s2 = "welcome to java";
		String s3 = "   welcome to java";
		String s4 = "Taramasalata";
		String s5 = "selenium";
		String s6 = "selenium";
		String s7 = "my salary is 25000";
		String s8 = "        Hi! My name is Kirubakaran";
		
		int length = s.length();
		System.out.println(length);
		
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		
		int indexOf = s.indexOf("a");
		System.out.println(indexOf);
		
		int lastIndexOf = s.lastIndexOf("a");
		System.out.println(lastIndexOf);
		
		int indexOf2 = s4.indexOf("a");
		System.out.println(indexOf2);
		
		int lastIndexOf2 = s4.lastIndexOf("a");
		System.out.println(lastIndexOf2);
		
		char charAt = s.charAt(2);
		System.out.println(charAt);
		
		char charAt2 = s4.charAt(8);
		System.out.println(charAt2);
		
		boolean equals = s.equals(s1);
		System.out.println(equals);
		
		boolean equals2 = s5.equals(s6);
		System.out.println(equals2);
		
		boolean IgnoreCase = s5.equalsIgnoreCase(s6);
		System.out.println(IgnoreCase);

		boolean IgnoreCase1 = s.equalsIgnoreCase(s1);
		System.out.println(IgnoreCase1);
		
		boolean contains = s2.contains("come");
		System.out.println(contains);
		
		boolean contains2 = s4.contains("selenium");
		System.out.println(contains2);
		
		String replace = s2.replace("java", "selenium");
		System.out.println(replace);
		
		String replace2 = s7.replace("25000", "27000");
		System.out.println(replace2);
		
		boolean startsWith = s2.startsWith("wel");
		System.out.println(startsWith);
		
		boolean startsWith2 = s7.startsWith("is");
		System.out.println(startsWith2);
		
		boolean endsWith = s2.endsWith("va");
		System.out.println(endsWith);
		
		boolean endsWith2 = s7.endsWith("my");
		System.out.println(endsWith2);
		
		boolean empty = s.isEmpty();
		System.out.println(empty);
		System.out.println(s3);
		
		String trim = s3.trim();
		System.out.println(trim);
		
		String trim2 = s8.trim();
		System.out.println(trim2);
		
		String substring = s2.substring(3);
		System.out.println(substring);
		
		String substring3 = s8.substring(12);
		System.out.println(substring3);
		
		String substring2 = s2.substring(3, 7);
		System.out.println(substring2);
		
		String substring4 = s8.substring(12, 20);
		System.out.println(substring4);
		
	}

}
