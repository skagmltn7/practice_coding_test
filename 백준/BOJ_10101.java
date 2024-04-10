package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_10101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = new int[3];
        int total = 0;
        for (int i = 0; i < 3; i++) {
            input[i] = Integer.valueOf(br.readLine());
            total += input[i];
        }

        if (total != 180) System.out.println("Error");
        else {
            HashSet<Integer> degree = new HashSet<>();
            degree.add(input[0]);
            degree.add(input[1]);
            degree.add(input[2]);
            if (degree.size() == 3) System.out.println("Scalene");
            else if (degree.size() == 2) System.out.println("Isosceles");
            else System.out.println("Equilateral");
        }
    }
}
