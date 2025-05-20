package day16;
import java.util.*;
import java.io.FileInputStream;

class Solution{
	public static void main(String args[]) throws Exception{

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
        sc.nextLine();
		for(int test_case = 1; test_case <= T; test_case++){
            StringBuilder sb = new StringBuilder();
            List<Character> list = new ArrayList<>();

            String N = sc.next();
            int max = 0;
            int min = Integer.MAX_VALUE;

            /* 1. TC String > char 변환 후 list 삽입 */
            for(int i=0; i<N.length(); i++){
                char num = N.charAt(i);
                list.add(num);
            }

            /* 2. 모든 쌍을 swap 해보고 가장 큰 값 찾기 */

            for(int i=0; i<list.size(); i++){
                for(int j=0; j<list.size(); j++){
                    if (i==j) continue;

                    Collections.swap(list, i, j);

                    if(list.get(0) != '0'){ // 0시작 금지
                        sb.setLength(0); // sb초기화
                        for(char c : list){
                            sb.append(c);
                        }
                        int changed = Integer.parseInt(sb.toString());
                        max = Math.max(max, changed);
                        min = Math.min(min, changed);
                    }


                    Collections.swap(list, i, j); // 원복
                }
            }        

            /* 3. 기존 TC 값과 비교해서 각각 더 큰 것, 작은 것으로 출력 */
            min = Math.min(min, Integer.parseInt(N));
            max = Math.max(max, Integer.parseInt(N));

            System.out.println("#"+test_case+" "+min+" "+max);
		}
	}
}