package day8;
import java.util.*;

class Solution{
	public static void main(String args[]) throws Exception{	
        
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        /*
        1. N은 항상 10의 배수이며, 10이상 100이하의 정수이다. (10 ≤ N ≤ 100)
        2. K는 1 이상 N 이하의 정수이다. (1 ≤ K ≤ N)
        3. K 번째 학생의 총점과 다른 학생의 총점이 동일한 경우는 입력으로 주어지지 않는다.
        */
        
        /*
        입력은 첫 줄에 총 테스트 케이스의 개수 T가 온다.
        다음 줄부터 각 테스트 케이스가 주어진다.
        테스트 케이스의 첫 번째 줄은 학생수 N 과, 학점을 알고싶은 학생의 번호 K 가 주어진다.
        테스트 케이스 두 번째 줄 부터 각각의 학생이 받은 시험 및 과제 점수가 주어진다.
        */
		for(int test_case = 1; test_case <= T; test_case++){
            List<Double> score = new ArrayList<>();
            int N = sc.nextInt(); 
            int K = sc.nextInt(); 
            String grade = "";
            //  N 명의 학생이 있을 경우 N/10 명의 학생들에게 동일한 평점을 부여
            // 총점 = 중간고사 35% + 기말고사 45% + 과제 20%
            
            for(int i=0; i<N; i++){
            	int mid = sc.nextInt();
                int fin = sc.nextInt();
                int home = sc.nextInt(); 
                double sum = (mid * 0.35) + (fin * 0.45) + (home * 0.2);
                score.add(sum);
            }
            Double target = score.get(K-1);
            List<Double> sorted = new ArrayList<>(score);
            sorted.sort(Collections.reverseOrder()); // 내림차순 정렬
            
           // Double indexOf 위험성 대비 -> 직접 비교 , 부동소수점 비교할때 오차범위 줄 때 많이 씀
            int rank = 0;
            for (int i = 0; i < sorted.size(); i++) {
                if (Math.abs(sorted.get(i) - target) < 1e-9) {
                    rank = i;
                    break;
                }
            }
           
            rank = rank/(N/10);
            
            switch(rank){
                case 0 : grade = "A+"; break;
                case 1 : grade = "A0"; break;
                case 2 : grade = "A-"; break;
                case 3 : grade = "B+"; break;
                case 4 : grade = "B0"; break;
                case 5 : grade = "B-"; break;
                case 6 : grade = "C+"; break;
                case 7 : grade = "C0"; break;
                case 8 : grade = "C-"; break;
                case 9 : grade = "D0"; break;            
            }
            System.out.println("#"+test_case+" "+grade);  
		}
	}
}
