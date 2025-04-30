import java.util.Scanner;
import java.io.FileInputStream;

class Solution{
	public static void main(String args[]) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++){
            /* 마름모 아인교..? */
			int length = sc.nextInt();
			System.out.println("#"+test_case+" "+length*length);

		}
	}
}