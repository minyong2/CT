import java.util.*;
import java.io.FileInputStream;

class Solution{
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        sc.nextLine();

		for(int test_case = 1; test_case <= T; test_case++){
            String s = sc.nextLine();
            List<String> list = Arrays.asList("a","e","i","o","u");
            
            for(int i=0; i<list.size(); i++){
            	if(s.contains(list.get(i))){
            		s = s.replace(list.get(i),"");
            	}
            }
            System.out.println("#"+test_case+" "+s);   	
		}
	}
}