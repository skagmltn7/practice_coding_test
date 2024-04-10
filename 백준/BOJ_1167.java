import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_1167 {

	private static boolean[] visited;
	private static HashMap<Integer, ArrayList<Node>> graph;
	private static int answer;
	private static int start;

	private static class Node {
		int n;
		int weight;

		public Node(int n, int weight) {
			this.n = n;
			this.weight = weight;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int V = Integer.parseInt(br.readLine());
		graph = new HashMap<>();

		for (int i = 0; i < V; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int s = Integer.parseInt(st.nextToken());
			ArrayList<Node> tmp = new ArrayList<>();
			while (true) {
				int e = Integer.parseInt(st.nextToken());
				if (e == -1) {
					graph.put(s, tmp);
					break;
				}
				int d = Integer.parseInt(st.nextToken());
				tmp.add(new Node(e, d));
			}
		}
		answer = -1;
		start = 0;
		visited = new boolean[V + 1];
		visited[1] = true;
		dfs(1, 0);

		visited = new boolean[V + 1];
		visited[start] = true;
		dfs(start, 0);
		System.out.println(answer);

	} // end of main

	private static void dfs(int cur, int total) {
		if (answer < total) {
			answer = total;
			start = cur;
		}
		for (Node nxt : graph.get(cur)) {
			if (!visited[nxt.n]) {
				visited[nxt.n] = true;
				dfs(nxt.n, total + nxt.weight);
				visited[nxt.n] = false;
			}
		}
	}

} // end of class
