package day8;

import java.util.*;

class Solution{
	public static void main(String args[]) throws Exception{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++){
            StringBuilder sb = new StringBuilder();
            List<String> StringList = new ArrayList<>();
            List<Integer> IntList = new ArrayList<>();
         
            StringList.add(" ");
            IntList.add(0);
			int n = sc.nextInt(); // 3
            int lineLength = 0;
            
            for(int i=0; i<n; i++){
            	String s = sc.next();
                int num = sc.nextInt();
                StringList.add(s);
                IntList.add(num);
            }
            
            for(int j=1; j<StringList.size(); j++){
            	int cnt = IntList.get(j);
                
                for(int k=1; k<=cnt; k++){
                	 sb.append(StringList.get(j));
                	lineLength++;
                    
                    if(lineLength == 10){
                	sb.append("\n");
                    lineLength = 0;
                	}
                }
            }
            
            System.out.println("#"+test_case+"\n"+sb.toString());
		}
	}
}