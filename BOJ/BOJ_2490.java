import java.io.*;
import java.util.*;

public class BOJ_2490 {
	public static void main (String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0;i<3;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int cntOne = 0;
			for(int j=0;j<4;j++) {
				int tmp = Integer.valueOf(st.nextToken());
				if(tmp==1) cntOne++;
			}
			switch(cntOne) {
			case 0:
				System.out.println("D");
				break;
			case 1:
				System.out.println("C");
				break;
			case 2:
				System.out.println("B");
				break;
			case 3:
				System.out.println("A");
				break;
			case 4:
				System.out.println("E");
				break;
			}
		}
	}
}
