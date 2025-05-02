import java.util.*;
import java.io.FileInputStream;

class Solution{
	public static void main(String args[]) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		

		for(int test_case = 1; test_case <= T; test_case++){
            int N = sc.nextInt(); //3
            int M = sc.nextInt(); //5
            int[] arrN = new int[N];
            int[] arrM = new int[M];
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<N; i++){
                arrN[i] = sc.nextInt();
            }
             for(int i=0; i<M; i++){
             	arrM[i] = sc.nextInt();
             }
            if(M >= N){
                for(int i=0; i<=M-N; i++){
                int sum = 0;
 				for(int j=0; j<N; j++){
                    sum += arrN[j]*arrM[j+i];
                }
                	list.add(sum);
            	}
            }else{
            	for(int i=0; i<=N-M; i++){
                	int sum = 0;
                    for(int j=0; j<M; j++){
                    	sum += arrN[j+i]*arrM[j];
                    }
                    list.add(sum);
                }
            }
            Collections.sort(list);
			System.out.println("#"+test_case+" "+list.get(list.size()-1)); 
		}
	}
}