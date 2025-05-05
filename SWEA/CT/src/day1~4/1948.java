import java.util.*;
import java.io.FileInputStream;

class Solution{
	public static void main(String args[]) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++){
            List<Integer> cal = new ArrayList<>();
            /*1/31, 2/28, 3/31, 4/30, 5/31, 6/30, 7/31, 8/31, 9/30, 10/31, 11/30, 12/31*/
            cal.add(0); //0번째 인덱스
            cal.add(31);
            cal.add(28);
            cal.add(31);
            cal.add(30);
            cal.add(31); // 5월
            cal.add(30);
            cal.add(31);
            cal.add(31);
            cal.add(30);
            cal.add(31);
            cal.add(30);
            cal.add(31); // 12월  
            
            int rst = 0;
            
            int mon1 = sc.nextInt();
            int day1 = sc.nextInt();
            int mon2 = sc.nextInt();
            int day2 = sc.nextInt();
            
            if(mon1 == mon2){
            	rst = day2 - day1 +1;
            }else{
            	int days = 0;
                for(int i=mon1; i<=mon2; i++){
                	days +=cal.get(i);
                }
                rst = days - day1 - (cal.get(mon2)-day2) +1;
            }
            System.out.println("#"+test_case+" "+rst);    
		}
	}
}