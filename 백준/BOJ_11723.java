import java.io.*;
import java.util.*;

public class BOJ_11723 {
	static HashSet<Integer> chkSet = new HashSet<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int M = Integer.parseInt(br.readLine());

		for (int i = 0; i < M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String command = st.nextToken();
			if (st.hasMoreTokens()) {
				int x = Integer.parseInt(st.nextToken());
				switch (command) {
				case "add":
					chkSet.add(x);
					break;
				case "remove":
					chkSet.remove(x);
					break;
				case "check":
					if (chkSet.contains(x)) {
						sb.append(1).append("\n");

					} else {
						sb.append(0).append("\n");
					}
					break;
				case "toggle":
					if (chkSet.contains(x)) {
						chkSet.remove(x);
					} else {
						chkSet.add(x);
					}
					break;
				}
			} else {
				switch (command) {
				case "all":
					for(int j=1;j<=20;j++) {
						chkSet.add(j);
					}
					break;
				case "empty":
					chkSet.clear();
					break;
				}
			}
		}
		System.out.println(sb);
	} // end of main
} // end of class
