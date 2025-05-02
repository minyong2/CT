import java.util.*;
import java.io.FileInputStream;

class Solution{
	public static void main(String args[]) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++){
            List<Integer> list = new ArrayList<>();
			int num = sc.nextInt();
            int maxDown = 0;
            int maxUp = 0;
            int same = 0;
            for(int i=0; i<num; i++){
            	int block = sc.nextInt();
                list.add(block);
            }
            
            for(int j=0; j<list.size()-1; j++){
            	if(list.get(j) > list.get(j+1)){
                	int down = list.get(j) - list.get(j+1);
                    maxDown = Math.max(maxDown,down);
                }else if(list.get(j) < list.get(j+1)){
                	int up = list.get(j+1) - list.get(j);
                    maxUp = Math.max(maxUp, up);
                }
            }       
         System.out.println("#"+test_case+" "+maxUp+" "+maxDown);                
	    }
    }
}