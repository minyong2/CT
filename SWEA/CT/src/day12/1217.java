package day12;

import java.util.Scanner;
class Solution{
    static int re(int num1, int num2){
        if (num2 == 0) return 1;
        return num1 * (re(num1, num2-1));

    }
	public static void main(String args[]) throws Exception{
	
		Scanner sc = new Scanner(System.in);
		int T=10;
		
		for(int test_case = 1; test_case <= T; test_case++){
            int num = sc.nextInt();
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            int sum = re(num1,num2);
            System.out.println("#"+test_case+" "+sum);
	
		}
	}
}
