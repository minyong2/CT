import java.util.Scanner;
import java.io.FileInputStream;

class Solution{
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++){
			int N = sc.nextInt(); // 퍼즐 칸 수
            int K = sc.nextInt(); // 단어 길이 , 2<=K<=5
            int cnt = 0;
            if(K > 5){
            	K = sc.nextInt();
            }
			int[][] chk = new int[N][N];
            for(int i=0; i<N; i++){
            	for(int j=0; j<N; j++){
                	chk[i][j] = sc.nextInt(); // 퍼즐 칸 입력받기
                }
            }
            // 가로 카운트 , 1이면 ++ , 0이면 초기화
			for(int i=0; i<N; i++){
                int one = 0;
            	for(int j=0; j<N; j++){
                	if(chk[i][j] == 1) one++;
                    else one = 0;
                    if(one == K){
                        // 왼쪽 체크 , 왼쪽이 벽 || 왼쪽이 0 
                        // 00111 j=4 k=3
                        boolean left = (j-K <0) || (chk[i][j-K] == 0);
                        // 오른쪽체크 , 오른쪽이 벽(배열의 끝인지) ||  오른쪽이 0
                        boolean right = (j == N-1) || (chk[i][j+1] == 0);
                    	if(left&&right) cnt++;
                    }
                }
            }
            
            // 세로 카운트
            for(int j=0; j<N; j++){
                int one = 0;
            	for(int i=0; i<N; i++){
                	if(chk[i][j] == 1) one++;
                    else one = 0;
                    if(one == K) {
                        boolean top = (i-K < 0) || (chk[i-K][j] == 0);
                        boolean bottom = (i == N-1) || (chk[i+1][j] == 0);
                        if(top&&bottom) cnt++;
                    }
                }
            }
           System.out.println("#"+test_case+" "+cnt);  
		}
	}
}