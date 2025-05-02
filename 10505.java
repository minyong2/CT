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
            int avg = 0;
            int cnt = 0;
			for(int i=0; i<num; i++){
            	int income = sc.nextInt();
                avg += income;
                list.add(income);
            }
            avg = avg/num;
            for(int j=0; j<list.size(); j++){
            	if(list.get(j) <= avg) cnt ++;
            }
            System.out.println("#"+test_case+" "+cnt); 

		}
	}
}