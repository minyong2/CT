package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class s24445 {
    static int order = 1;
    static int[] visited;
    static ArrayList<Integer>[] graph; //정점
    static void bfs(int R){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(R);
        visited[R] = order++;
        while (!queue.isEmpty()) {          
            int curr = queue.poll();
            for(int i : graph[curr]){
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
        int N = Integer.parseInt(st.nextToken()); // 정점 수
        int M = Integer.parseInt(st.nextToken()); // 간선 수
        int R = Integer.parseInt(st.nextToken()); // 시작 정점

        graph = new ArrayList[N+1]; // 정점은 1부터 시작이기에 0-based+1

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
        for(int i=0; i<=N; i++){ // 내림차순
            Collections.sort(graph[i], Collections.reverseOrder());
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

