import java.util.Scanner;
import java.io.FileInputStream;

class Solution{
	public static void main(String args[]) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++){
			int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int result = -1;
            
            if(num1 >= 10 || num2 >=10){   
            	System.out.println("#"+test_case+" "+result);    
            }else{
                result = num1*num2;
           	    System.out.println("#"+test_case+" "+result);    
            }

		}
	}
}