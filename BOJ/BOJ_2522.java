import java.io.*;

public class BOJ_2522{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 1;

        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < n - cnt; j++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j < cnt; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < n - 1)
                cnt++;
            else
                cnt--;
        }
    }
}