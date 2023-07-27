import java.io.*;
import java.util.*;

public class BOJ_2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] coins = {25,10,5,1};
        int n = Integer.valueOf(br.readLine());
        for(int i=0;i<n;i++){
            int change = Integer.valueOf(br.readLine());
            for(int j=0;j<4;j++){
                System.out.print(change/coins[j]+" ");
                change %= coins[j];
            }
            System.out.println();
        }
    }
}