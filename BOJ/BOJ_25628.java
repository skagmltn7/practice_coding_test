package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_25628 {
	public static void main (String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int bread = Integer.valueOf(st.nextToken());
        int meat = Integer.valueOf(st.nextToken());
        
        System.out.println(Integer.min(bread/2,meat));
    }
}
