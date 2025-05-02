import java.util.*;
import java.io.FileInputStream;

class Solution{
	public static void main(String args[]) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++){
            StringBuilder sb = new StringBuilder();
			int num_cnt = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<num_cnt; i++){
            	int num = sc.nextInt();
                list.add(num);
            }
            Collections.sort(list);
            for(int j : list){
            	sb.append(j).append(" ");
            }
           
            System.out.println("#"+test_case+" "+sb);  
		}
	}
}