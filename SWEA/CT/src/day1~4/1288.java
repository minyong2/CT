import java.util.Scanner;
import java.io.FileInputStream;

class Solution{
    public static boolean allTrue(boolean[] chk){
    	for(boolean i : chk){
        	if(!i) return false;
        }
        return true;
    }
    
	public static void main(String args[]) throws Exception{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++){
            int num = sc.nextInt();
            int k = 1;
            boolean[] chk = new boolean[10]; //0~9 index
            
            while(!allTrue(chk)){
                int temp = k*num;
            	while(temp > 0){
                	int index =temp%10;
                    chk[index] = true;
                    temp = temp / 10;
                }
                if(allTrue(chk)) break;
                k++;
            }
			System.out.println("#"+test_case+" "+(k*num));
		}
	}
}