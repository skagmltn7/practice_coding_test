package BOJ;
import java.io.*;
import java.util.*;

public class BOJ_10768 {
    public static String dateChk(int month, int date) {
        if (month < 2) return "Before";
        else {
            if (month == 2)
                if (date < 18) return "Before";
                else if (date == 18) return "Special";
            return "After";
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int month = Integer.valueOf(br.readLine());
        int date = Integer.valueOf(br.readLine());
        System.out.println(dateChk(month, date));
    }
}
