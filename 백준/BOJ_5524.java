package BOJ;
import java.io.*;

public class BOJ_5524 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		String[] names = new String[n];
		
		for(int i =0;i<n;i++) {
			names[i] = br.readLine().toLowerCase();
		}
		
		for(String name: names)
			System.out.println(name);
	}
}
