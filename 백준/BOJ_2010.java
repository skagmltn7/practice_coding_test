import java.io.*;

public class BOJ_2010{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        long total = 0;
        for(int i=0;i<n;i++){
            total += Long.valueOf(br.readLine());
        }
        total -= n-1;
        System.out.println(total);
    }
}