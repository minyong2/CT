package day13;

import java.util.*;


class Solution{
	public static void main(String args[]) throws Exception{

		Scanner sc = new Scanner(System.in);
		int T = 10;

		for(int test_case = 1; test_case <= T; test_case++){
            List<Character> list = new ArrayList<>();
            int cnt = sc.nextInt();
            String num = sc.next();
            boolean change = true;
            for(int i=0; i<num.length(); i++){
                list.add(num.charAt(i));
            }

            while (change) {
                change = false;
                for(int i=0; i<list.size()-1; i++){
                    if (list.get(i).equals(list.get(i+1))) {
                        list.remove(i);
                        list.remove(i);
                        change = true;
                        if (i>0) i--;
                    }else{

                    }
                }
            }
            System.out.print("#"+test_case+" ");
            for(char c : list){
                System.out.print(c);
            }
            System.out.println();

		}
	}
}