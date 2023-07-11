package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_2083 {
	public static String chkClass(int age, int weight) {
		if(age > 17 || weight >= 80) return "Senior";
		return "Junior";
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String name;
		int age, weight;
		while(true) {
			String cur = br.readLine();
			if(cur.equals("# 0 0")) break;
			st = new StringTokenizer(cur);
			name = st.nextToken();
			age = Integer.valueOf(st.nextToken());
			weight = Integer.valueOf(st.nextToken());
			System.out.printf("%s %s\n",name,chkClass(age,weight));			
		}
	}	
}
