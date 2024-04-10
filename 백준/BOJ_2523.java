import java.io.*;

public class BOJ_2523{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        int cnt = 0;
        for (int i = 0; i < 2*n-1; i++) {
            if (i < n)
                cnt++;
            else
                cnt--;
            for (int j = 0; j < cnt; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}