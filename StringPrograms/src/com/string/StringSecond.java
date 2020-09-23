package com.string;

public class StringSecond {
  public static void main(String[] args) {
	String s = "Ram is a student";
	String s1 = new String();
	for (int i = s.length()-1; i >= 0; i--) {
		s1 = s1 + s.charAt(i);
		
	}
}
}
