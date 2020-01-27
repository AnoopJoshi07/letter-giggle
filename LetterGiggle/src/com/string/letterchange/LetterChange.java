package com.string.letterchange;

import java.util.*;

public class LetterChange {

	@SuppressWarnings("null")
	public static String LetterChanges(String str) {
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			if (c >= 'a' && c<='z') {
				if (c == 'z') {
					ch[i] = (char) (c-57);
				} 
				else {
					ch[i] = (char) (c + 1);
				}
				if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
					ch[i] = (char) (c - 31);
				}
			}
			else if (c >= 'A' && c<= 'Z') {
				if (c == 'Z') {
					ch[i] = (char) (c-25);
				} 
				else {
					ch[i] = (char) (c+33);
				}
				if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
					ch[i] = (char) (c + 1);
				}
			}
			else {
				ch[i] = c;
			}
			System.out.print(ch[i]);
		}
		return new String(ch);
	}

	public static void main(String[] args) {
		// keep this function call here
		Scanner s = new Scanner(System.in);
		System.out.print("\n"+LetterChanges(s.nextLine()));
		s.close();
	}
}