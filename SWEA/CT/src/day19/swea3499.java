package day19;

import java.util.*;
import java.io.FileInputStream;
class Solution{
	public static void main(String args[]) throws Exception{
        /* nextLine()은 한줄 전체 읽음
         * next() 는 공백기준 문자열 읽음
         */

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++){
			List<String> list1 = new ArrayList<String>();
			List<String> list2 = new ArrayList<String>();
			List<String> rst = new ArrayList<String>();
			int N = sc.nextInt();
            int half = (N+1)/2;
            sc.nextLine();
			//예시 A B C D E
			for(int i=0; i<half; i++) { // A B C 
				list1.add(sc.next());
			}
			for(int i=half; i<N; i++) { // D E
				list2.add(sc.next());
			}
			
			for(int i=0; i<list2.size(); i++) {
				rst.add(list1.get(i));
				rst.add(list2.get(i));
			}
			if(list1.size()>list2.size()) {
				rst.add(list1.get(list1.size()-1));
			}
			
			System.out.print("#"+test_case+" ");
			for(int i=0; i<rst.size(); i++) {
				System.out.print(rst.get(i)+" ");	
			}
			System.out.println();
		}
	}
}