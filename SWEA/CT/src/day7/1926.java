package day7;
import java.util.Scanner;
class Solution
{
	public static void main(String args[]) throws Exception{
        StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
        String numStr = null;

		for(int i=1; i<=num; i++){
        	int cnt = 0;
         	String strNum = String.valueOf(i);
            
            for(char c : strNum.toCharArray()){
            	if(c =='3' || c =='6' || c=='9'){
                	cnt ++;
                }
            }
            
            if(cnt > 0){
                for(int j=0; j< cnt; j++){
                sb.append("-");
                }
            }else{
            sb.append(i);
            }
            sb.append(" ");
	}
         System.out.print(sb.toString());
	}
}