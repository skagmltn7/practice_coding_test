class Solution {
    boolean solution(String s) {
        int[] cnt = new int[2];
        for(char c:s.toCharArray()){
            c = Character.toLowerCase(c);
            if(c=='y') cnt[0]++;
            else if(c=='p') cnt[1]++;
        }
        if(cnt[0]==cnt[1])return true;
        return false;
    }
}