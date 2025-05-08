package silver;

import java.io.*;
import java.util.*;

public class s24444 {
        /* N개의 정점과 M개의 간선으로 구성된 무방향 그래프
       정점 R에서 시작하여 너비 우선 탐색으로 노드를 방문할 경우 
       노드의 방문 순서를 오름차순 출력     
        # V : 정점 집합, E : 간선 집합, R : 시작 정점 
       */

    static int[] visited;
    static ArrayList<Integer>[] graph;
    static int order = 1;
    static void bfs(int R){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(R);
        visited[R] = order++;

        while (!queue.isEmpty()) {
            int curr = queue.poll();

            for(int i:graph[curr]){
                if (visited[i] == 0) {
                    visited[i] = order++;
                    queue.offer(i);
                }
            }
        }
    }
      public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken()); // 정점
        int M = Integer.parseInt(st.nextToken()); // 간선
        int R = Integer.parseInt(st.nextToken()); // 시작 정점

        graph = new ArrayList[N+1];

        for(int i=0; i<=N; i++){ 
            graph[i] = new ArrayList<>();
        }
        for(int i=0; i<M; i++){ //간선 정보
            st = new StringTokenizer(br.readLine());
            int U = Integer.parseInt(st.nextToken()); 
            int V = Integer.parseInt(st.nextToken()); 
            graph[U].add(V);
            graph[V].add(U);
        }
        
        for(int i=0; i<=N; i++){
            Collections.sort(graph[i]);
        }

        visited = new int[N+1];
        bfs(R);

        for(int i=1; i<=N; i++){
            bw.write(visited[i]+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
      }
}
