import java.io.*;
import java.util.*;

public class BOJ_2455 {
	public static void main (String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] stations = new int[6];
		
		for(int i=1;i<5;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int getOff = Integer.valueOf(st.nextToken());
			int getOn = Integer.valueOf(st.nextToken());
			
			stations[i] = getOn-getOff + stations[i-1];
		}
		System.out.println(Arrays.stream(stations).max().getAsInt());
	}
}
