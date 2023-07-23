package BOJ;

import java.io.*;
import java.util.*;

public class BOJ_6810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ten = 91;
        int[] multi = { 1, 3, 1 };
        for (int i = 0; i < 3; i++) {
            ten += Integer.valueOf(br.readLine()) * multi[i];
        }
        System.out.printf("The 1-3-sum is %d", ten);
    }
}
