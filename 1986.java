import java.util.Scanner;
import java.io.FileInputStream;


class Solution{
	public static void main(String args[]) throws Exception{
	
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++){
			int num = sc.nextInt();
            		int sum = 0;
            
            for(int i=1; i<=num; i++){
            	if(i % 2  == 0){ // 짝수
                    sum -= i;
                }else{ // 홀수
                	sum += i;
                }
            }
            System.out.println("#"+test_case+" "+sum); 
		
		}
	}
}
