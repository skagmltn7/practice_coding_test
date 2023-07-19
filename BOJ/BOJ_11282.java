package BOJ;

import java.io.*;
import java.util.*;

public class BOJ_11282 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.valueOf(br.readLine()) - 1;
        int standard = Integer.valueOf('가');

        System.out.println((char) (standard + input));
    }
}
