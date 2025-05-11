package day12;

import java.util.*;

class Solution{
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T;

		T=sc.nextInt();
        sc.nextLine();

		for(int test_case = 1; test_case <= T; test_case++){
            StringBuilder sb = new StringBuilder();
            String str = null;
            // 0011 , 100
            String target = sc.nextLine();
            int cnt = 0;

            for(int i=0; i<target.length(); i++){
                sb.append("0");
            }
            str = sb.toString();

            for(int i=0; i<sb.length(); i++){
                if(str.charAt(i) != target.charAt(i)){
                    cnt++;
                    char to = target.charAt(i);
                    for(int j=i; j<sb.length(); j++){
                        sb.setCharAt(j, to);
                    }
                    str = sb.toString();
                }
            }
            System.out.println("#"+test_case+" "+cnt);
		}
	}
}