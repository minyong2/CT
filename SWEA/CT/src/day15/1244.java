package day15;

import java.util.*;

class Solution{
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++){
            String number = sc.next(); // 숫자열
            int changeCount = sc.nextInt(); // 교환 횟수
            
            List<Character> digit = new ArrayList<>();
            for(char c : number.toCharArray()){
                digit.add(c);
            }

            int len = digit.size();

            for(int i=0; i<len && changeCount > 0; i++){
                char maxDigit = digit.get(i);
                int maxIndex = -1;

                for(int j=len-1; j>i; j--){
                    if (digit.get(j) > maxDigit) {
                        maxDigit = digit.get(j);
                        maxIndex = j;
                    }
                }

                if(maxIndex != -1 && digit.get(i) != digit.get(maxIndex)){
                    Collections.swap(digit, i, maxIndex);
                    changeCount --;
                }
            }

            if (changeCount % 2 == 1 && digit.size() >= 2) {
            Collections.swap(digit, digit.size() - 1, digit.size() - 2);
            }


            System.out.print("#"+test_case+" ");
            for(char c : digit){
                System.out.print(c);
            }
            System.out.println();
		}
	}
}