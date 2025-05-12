package day13;
import java.util.*;
import java.io.FileInputStream;

/*
1. I(삽입) x, y, s : 앞에서부터 x번째 암호문 바로 다음에 y개의 암호문을 삽입한다. s는 덧붙일 암호문들이다.[ ex) I 3 2 123152 487651 ]
2. D(삭제) x, y : 앞에서부터 x번째 암호문 바로 다음부터 y개의 암호문을 삭제한다.[ ex) D 4 4 ]
3. A(추가) y, s : 암호문 뭉치 맨 뒤에 y개의 암호문을 덧붙인다. s는 덧붙일 암호문들이다. [ ex) A 2 421257 796813 ]
 */
class Solution{
    static List<Integer> code = new ArrayList<>();
    static void Insert(Scanner sc){
        int x = sc.nextInt(); // 삽입 위치
        int y = sc.nextInt(); // 삽입 수
        for(int i=0; i<y; i++){
            int s = sc.nextInt();
            code.add(x+i,s);
        }
    }
    static void Delete(Scanner sc){
        int x = sc.nextInt(); // 삭제 위치
        int y = sc.nextInt(); // 삭제 수
        for(int i=0; i<y; i++){
            code.remove(x+i);
        }
    }
    static void Apply(Scanner sc){
        int y = sc.nextInt(); // 붙일 수
        for(int i=0; i<y; i++){
            int s = sc.nextInt();
            code.add(s);
        }
        
    }
	public static void main(String args[]) throws Exception{

		Scanner sc = new Scanner(System.in);
		int T = 10;

		for(int test_case = 1; test_case <= T; test_case++){
            int codeCnt = sc.nextInt();
            for(int i=0; i<codeCnt; i++){
                code.add(sc.nextInt());
            }
            
            int cmdCnt = sc.nextInt();
            for(int i=0; i<cmdCnt; i++){
                String cmd = sc.next();
                if (cmd.equals("I")) Insert(sc);
                if (cmd.equals("D")) Delete(sc);
                if (cmd.equals("A")) Apply(sc);

            }

            System.out.print("#"+test_case+" ");
            for(int i=0; i<10; i++){
                System.out.print(code.get(i)+" ");
            }
            System.out.println();
		}
	}
}