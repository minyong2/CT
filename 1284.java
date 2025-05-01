import java.util.Scanner;
import java.io.FileInputStream;

class Solution{
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        
		for(int test_case = 1; test_case <= T; test_case++){
			int P = sc.nextInt(); // A회사 :: 1L당 P원
            int Q = sc.nextInt(); // B 회사 :: 기본값
            int R = sc.nextInt(); // B 회사 :: 사용량 기준
            int S = sc.nextInt(); // B회사 :: (W>R) 1L당 S원
            int W = sc.nextInt(); // 사용량
            int CompanyA = 0;
            int CompanyB = 0;
            
            // CompanyA
            CompanyA = W*P;
            // CompanyB
            if(W > R){
            	CompanyB = (W-R)*S+Q;
            }else if(W < R){
            	CompanyB = Q;
            }
            System.out.println("#"+test_case+" "+Math.min(CompanyA,CompanyB)); 
		}
	}
}