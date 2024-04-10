package BOJ;

import java.io.*;
import java.util.*;

public class BOJ_23795 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int res = 0;
        while (true) {
            int input = Integer.valueOf(br.readLine());
            if (input == -1)
                break;
            res += input;
        }
        System.out.println(res);
    }
}
