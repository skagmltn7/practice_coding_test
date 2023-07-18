package BOJ;

import java.io.*;

public class BOJ_11283 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.valueOf(br.readLine().charAt(0));
        int pivot = Integer.valueOf("가".charAt(0));
        System.out.println(input - pivot + 1);
    }

}