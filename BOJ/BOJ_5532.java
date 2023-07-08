package BOJ;
import java.io.*;

public class BOJ_5532 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int vacation = Integer.valueOf(br.readLine());
        int totalMath = Integer.valueOf(br.readLine());
        int totalKorean = Integer.valueOf(br.readLine());
        int mathPerDay = Integer.valueOf(br.readLine());
        int koreanPerDay = Integer.valueOf(br.readLine());

        int completeMath = totalMath / mathPerDay;
        if (totalMath % mathPerDay != 0) completeMath += 1;
        int completeKorean = totalKorean / koreanPerDay;
        if (totalKorean % koreanPerDay != 0) completeKorean += 1;

        System.out.println(vacation - Integer.max(completeKorean, completeMath));
    }
}
