import java.io.*;

public class BOJ_2445 {
	public static void main (String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		for(int i=0;i<n;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			for(int j=n-i-1;j>0;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=i;j<n-1;j++) {
				System.out.print("*");
			}
			for(int j=0;j<i+1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i+1;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<n-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
