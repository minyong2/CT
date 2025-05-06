package day7;
/* 5/6 */
import java.util.*;

class Solution{
	public static void main(String args[]) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++){
            int n = sc.nextInt();
            int[][] farm = new int[n][n];
            
            int start = n/2;
            int range = 0;
            int sum = 0;
            
            for(int i=0; i<n; i++){
                String line = sc.next();
                for(int j=0; j<n; j++){
                	farm[i][j] = line.charAt(j)-'0';
                }
            }
            
            for(int i=0; i<n; i++){
                if(i <= start){
                	range = i;
                }else{
                	range = n-i-1;
                }
                
                for(int j=start-range; j<=start+range; j++){
                	sum += farm[i][j];
                }
            }
            System.out.println("#"+test_case+" "+sum);   
		}
	}
}