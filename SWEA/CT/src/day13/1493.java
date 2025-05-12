package day13;

import java.util.*;
import java.io.FileInputStream;


class Solution{
    /*
      2 (T)
      1 5
      3 9 
       p★q는 #(&(p)+&(q))
       1★5 = #(&(1)+&(5)) = #((1,1)+(2,2)) = #(3,3) = 13

       등차수열
    */

    public static int[] getPos(int num){ // num > pos
        int s = 1;
        while (s*(s+1)/2 < num) {
            s++;
        }
        int start = s*(s-1)/2+1; //s번째 대각선의 시작 숫자
        int x = num - start + 1; // 대각선 s에서 몇번째 좌표인지?
        int y = s-x+1; // x+y = s+1
        return new int[] {x,y};
    }

    public static int getNum(int x, int y){ // pos > num
        int s = x+y-1;
        int start = s*(s-1)/2+1;
        return start + (x-1);
    }
	public static void main(String args[]) throws Exception{

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++){
            int p = sc.nextInt();
            int q = sc.nextInt();

            int[] posP = getPos(p);
            int[] posQ = getPos(q);

            int X = posP[0] + posQ[0];
            int Y = posP[1] + posQ[1];

            int rst = getNum(X, Y);
            System.out.println("#"+test_case+" "+rst);
		}
	}
}