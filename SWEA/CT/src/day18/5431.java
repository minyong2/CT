package day18;

import java.util.*;
import java.io.FileInputStream;

class Solution{
	public static void main(String args[]) throws Exception{

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++){
            int N = sc.nextInt();
            int K = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            for(int i=1; i<=N; i++){ // 수강생
                list.add(i);
            }

            for(int i=1; i<=K; i++){
                int sub = sc.nextInt();
                list.remove(Integer.valueOf(sub));
            }

            Collections.sort(list);
            System.out.print("#"+test_case+" ");
            for(int i=0; i<list.size(); i++){
                System.out.print(list.get(i)+" ");
            }
            System.out.println();
		}
	}
}