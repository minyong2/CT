package dfs;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class dfs24479 {
    static int[] visited;
    static ArrayList<Integer>[] graph;
    static int cnt;
    static void dfs(int R){
        visited[R] = cnt++;
        for(int i: graph[R]){
            if (visited[i] == 0) {
                dfs(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken()); // 시작 정점

        graph = new ArrayList[N+1];

        for(int i=1; i<=N; i++){ // graph배열 N+1만큼 초기화
            graph[i] = new ArrayList<>();
        }

        for(int i=1; i<=M; i++){
            st = new StringTokenizer(br.readLine());
            int U = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());
            graph[U].add(V);
            graph[V].add(U);
        }

        for(int i=1; i<=N; i++){
            Collections.sort(graph[i]);
        }

        visited = new int[N+1];
        dfs(R);

        for(int i=1; i<=N; i++){
            bw.write(String.valueOf(visited[i])+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
