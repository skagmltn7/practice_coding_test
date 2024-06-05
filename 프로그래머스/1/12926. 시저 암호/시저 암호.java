import java.util.*;

class Solution {
    static final int MOD = 'z'-'a'+1;
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder(s);
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<sb.length();i++){
            char tmp = sb.charAt(i);
            int chk = 0;
            if('a'<= tmp && tmp <= 'z'){
                chk = tmp+n;
                if(chk>'z') chk -= MOD;
                ans.append((char)chk);
            }else if('A'<=tmp && tmp <= 'Z'){
                chk = tmp+n;
                if(chk>'Z') chk -= MOD;
                ans.append((char)chk);
            }else{
                ans.append(tmp);
            }
        }
        return ans.toString();
    }
}