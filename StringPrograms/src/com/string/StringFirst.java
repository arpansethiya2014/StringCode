package com.string;

public class StringFirst {
    public static void main(String[] args) {
		String s = "Ram Is A Student Ram goes to Ram school";
		String[]  s1 = s.split("\\s");
		int count = 0;
		for(int i=0;i<s1.length;i++) {
			for (int j = i+1; j < s1.length; j++) {
				if(s1[i].equals(s1[j])) {
					count = count + 1;
				}
				
			}
			
			
		}
		System.out.println(count);
	}
}
