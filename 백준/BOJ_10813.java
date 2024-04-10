import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int[] busket = new int[n+1];
		
		for(int i =1; i<=n;i++) {
			busket[i] = i;
		}
		
		int m = Integer.valueOf(st.nextToken());
		for(int i = 0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			int num1 = Integer.valueOf(st.nextToken());
			int num2= Integer.valueOf(st.nextToken());
			int tmp = busket[num1];
			busket[num1] = busket[num2];
			busket[num2] = tmp;
			
		}
		
		for(int i=1;i<=n;i++) {
			System.out.print(busket[i]+" ");
		}
	}
}
