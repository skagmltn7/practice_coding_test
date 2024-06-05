class Solution {
    public int[] solution(int brown, int yellow) {
        int h = 0;
        int w = 0;
        int[] ans = new int[2];
        for(int i=1;i<=yellow;i++){
           if(yellow%i!=0) continue;
            h = i + 2;
            w = yellow/i+2;
            if(h*w==brown+yellow && h<=w){
                ans = new int[]{w,h};
                break;
            }
        }
        return ans;
    }
}