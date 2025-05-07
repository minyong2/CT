package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class s24480 {
    static ArrayList<Integer> graph[];
    static int[] visited;
    static int cnt = 1;
    static void dfs(int R){
        visited[R] = cnt++;
        for(int i : graph[R]){
            if (visited[i] == 0) {
                dfs(i);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 정점 수
        int M = Integer.parseInt(st.nextToken()); // 간선 수
        int R = Integer.parseInt(st.nextToken()); // 시작 정점

        graph = new ArrayList[N+1];

        for(int i=1; i<=N; i++){
            graph[i] = new ArrayList<>(); 
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int U = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());
            graph[U].add(V);
            graph[V].add(U);
        }

        for(int i=1; i<=N; i++){
            Collections.sort(graph[i], Collections.reverseOrder());
        }

        visited = new int[N+1];
        dfs(R);

        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=N; i++){
            sb.append(visited[i]).append("\n");
        }
        System.out.println(sb);
    }
}
