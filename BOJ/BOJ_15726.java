package BOJ;

import java.util.*;

public class BOJ_15726 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int x = (int) ((a * b) / c);
        int y = (int) ((a / b) * c);
        if (x > y)
            System.out.println(x);
        else
            System.out.println(y);
    }
}