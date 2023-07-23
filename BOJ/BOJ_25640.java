package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_25640 {
	public static void main (String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String jinhos = br.readLine();
        int n = Integer.valueOf(br.readLine());
        
        int cnt = 0;
        for(int i=0;i<n;i++){
            if(jinhos.equals(br.readLine())){
                cnt++;
            } 
        }
        System.out.println(cnt);
    }
}
