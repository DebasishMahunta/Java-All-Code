package Level1LoopsAndif;
import java.util.*;

public class FactorsOfNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int count = 0;
		for(int i=1; i<=n; i++) {
			if(n%i == 0) {
				System.out.println(i);
			}
		}
		
	}

}
