package String;

import java.util.Scanner;

public class IsPangram {
	static boolean isPangram(String s) {
		String t = "abcdefghijklmnopqrstuvwxyz";
		s = s.toLowerCase();
		int count = 0;
		
		for(int i=0; i<t.length(); i++) {
			if(s.indexOf(t.charAt(i)) >= 0) {
				count++;
			} else {
				break;
			}
		}
		
		System.out.println(count);
		
		if(count == 26) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(isPangram(s));
	}
}
