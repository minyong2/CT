package silver;

import java.io.*;
import java.util.*;

public class s2606 {
    static ArrayList<Integer>[] graph;
    static int[] visited;
    static int order=1;
    static int cnt = 0;
    static void bfs(int start){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = order++;
        while (!queue.isEmpty()) {
            int curr = queue.poll();

            for(int i:graph[curr]){
                if(visited[i] == 0){
                    visited[i] = order++;
                    queue.offer(i);
                    cnt ++;
                }
            }
            
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int com = Integer.parseInt(st.nextToken()); //컴퓨터 수 1~N
        st = new StringTokenizer(br.readLine());
        int connect = Integer.parseInt(st.nextToken()); //연결 수

        graph = new ArrayList[com+1];
        for(int i=0; i<=com; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<connect; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }

        visited = new int[com+1];
        bfs(1);

        bw.write(cnt+"\n");
        bw.flush();
        bw.close();
        br.close();
    }
}

