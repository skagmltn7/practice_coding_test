package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_19602 {
	public static void main (String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int happiness = 0;
        for(int i=0;i<3;i++){
            happiness += (i+1) * Integer.valueOf(br.readLine());
        }
        System.out.println(happiness>=10?"happy":"sad");
    }
}
