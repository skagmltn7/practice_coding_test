import java.io.*;

public class BOJ_2443 {
	public static void main (String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		for(int i=n;i>=0;i--) {
			for(int j=n-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
