package day13;
import java.util.*;
/*리스트 자료구조 , 인덱스 조작 */
/*
6  (원본 암호문 길이)
449047 855428 425117 532416 358612 929816 ... (원본 암호문)
7 (명령어 개수)
I 1 5 400905 139831 966064 336948 119288 (명령어)
 */
class Solution{
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T;
		T=10;

		for(int test_case = 1; test_case <= T; test_case++){
            List<Integer> origin = new ArrayList<>();
            int length = sc.nextInt(); //암호문 길이

            for(int i=0; i<length; i++){ // 원본 암호문
                origin.add(sc.nextInt());
            }

            int commandCnt = sc.nextInt();
            for(int i=0; i<commandCnt; i++){
                String commandS = sc.next(); // I
                int x = sc.nextInt(); // 삽입 위치
                int y = sc.nextInt(); // 삽입 수 
                for(int j=0; j<y; j++){
                    int s = sc.nextInt();
                    origin.add(x+j,s);
                }
            }

            System.out.print("#"+test_case+" ");
            for(int i=0; i<10; i++){
                System.out.print(origin.get(i)+" ");
            }
            System.out.println();
		}
	}
}