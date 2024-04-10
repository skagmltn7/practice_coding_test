package BOJ;
import java.io.*;

public class BOJ_13752 {
	static char stick = '=';
	
	public static void drawStick(int num) {
		String total = "";
		for(int i=0; i< num; i++) total += stick;
		System.out.println(total);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		for(int i=0;i<n;i++) {
			drawStick(Integer.valueOf(br.readLine()));
		}
	}	
}
