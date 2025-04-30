import java.util.*;
import java.io.FileInputStream;

class Solution{
	public static void main(String args[]) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		sc.nextLine();
		for(int test_case = 1; test_case <= T; test_case++){
            String encode = sc.nextLine();
            
            byte[] db = Base64.getDecoder().decode(encode);
            String decode = new String(db);
            
            System.out.println("#"+test_case+" "+decode);
		}
	}
}