package SWEA;
import java.io.*;
import java.util.*;

public class SWEA_7465 {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static void bfs(int node){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        visited[node] = true;

        while(!queue.isEmpty()){
            int cur = queue.poll();
            Iterator<Integer> iter = graph[cur].iterator();
            while(iter.hasNext()){
                int nxt = iter.next();
                if(!visited[nxt]){
                    visited[nxt] = true;
                    queue.add(nxt);
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n, m;
        int u, v;
        int answer;

        int T = Integer.parseInt(br.readLine());
        for(int tc = 1; tc <= T; tc++) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            graph = new ArrayList[n+1];
            for(int i = 1; i <= n; i++) graph[i] = new ArrayList<>();

            for (int j = 0; j < m; j++) {
                st = new StringTokenizer(br.readLine());
                u = Integer.parseInt(st.nextToken());
                v = Integer.parseInt(st.nextToken());
                graph[u].add(v);
                graph[v].add(u);
            }
            answer = 0;
            visited = new boolean[n+1];
            Arrays.fill(visited,false);
            for(int node = 1; node <= n; node++){
                if(!visited[node]){
                    answer += 1;
                    bfs(node);
                }
            }
            System.out.printf("#%d %d",tc,answer);
        }
    }
}
