import java.util.Scanner;
import java.io.FileInputStream;

class Solution{
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        sc.nextLine();
        
		for(int test_case = 1; test_case <= T; test_case++){
            String s = sc.nextLine();
            int half = s.length()/2;
            
            for(int p=1; p<half; p++){
                boolean match = true;
                String pattern = s.substring(0,p);
                
                for(int i=0; i+p<=s.length(); i+=p){
                	String s2 = s.substring(i,i+p);
                    if(!s2.equals(pattern)){
                    	match = false;
                        break;
                    }
                }
                if(match){
                	System.out.println("#"+test_case+" "+pattern.length());
                    break;
                }
            }
		}
	}
}