package BOJ;
import java.io.*;

public class BOJ_16486 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double pi = 3.141592;
		int d1 = Integer.valueOf(br.readLine());
		int d2 = Integer.valueOf(br.readLine());
		
		System.out.println(2*(d1+d2*pi));
	}	
}
