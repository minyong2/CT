import java.util.Scanner;
import java.io.FileInputStream;


class Solution{
	public static void main(String args[]) throws Exception	{		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++){
            int N = sc.nextInt();
            int[] prime = {2,3,5,7,11};
            int[] cnt = new int[prime.length];
            
            for(int i=0; i<prime.length; i++){
            	while(N % prime[i] == 0){
                	cnt[i] ++;
                    N /= prime[i];
                }
            }
            System.out.print("#"+test_case);   
			for(int count : cnt){
             	System.out.print(" "+count);
            }
             System.out.println();
			
		}
	}
}