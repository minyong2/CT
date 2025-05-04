package day5;
import java.util.*;

class Solution{
	public static void main(String args[]) throws Exception{	
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		/* 0 : 현재 속도 유지          1 : 가속          2 : 감속 */
		for(int test_case = 1; test_case <= T; test_case++){
            int N = sc.nextInt();
            int speed = 0;
            int total = 0;
            for(int i=0; i<N; i++){
            	int command = sc.nextInt();
                
                if(command == 1){ // 가속
                	int ac = sc.nextInt(); // 속도
                    speed += ac;
                }else if(command == 2){
                	int dc = sc.nextInt();
                    speed -= dc;
                }else if(command == 0){}
                    
                if(speed < 0){
                	speed = 0;
                }
                total += speed;
            }
            System.out.println("#"+test_case+" "+total); 	
		}
	}
}