import java.io.*;

public class BOJ_2444 {
	public static void main (String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		
		for(int i=1; i<=n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n-1; i>=0;i--) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
