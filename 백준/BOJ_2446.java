import java.io.*;

public class BOJ_2446{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        for (int i = n; i > 0; i--) {
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 2; i <= n; i++) {
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}