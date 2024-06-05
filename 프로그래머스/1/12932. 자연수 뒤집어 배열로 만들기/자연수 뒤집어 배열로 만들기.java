import java.util.*;

class Solution {
    public int[] solution(long n) {
        String str = ""+n;
        char[] tmp = str.toCharArray();
        int[] ans = new int[tmp.length];
        int inx = 0;
        for(int i=tmp.length-1;i>=0;i--){
            ans[inx++] = tmp[i]-'0';
        }
        return ans;
    }
}