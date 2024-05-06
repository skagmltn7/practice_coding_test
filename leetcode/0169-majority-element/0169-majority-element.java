class Solution {
    public int majorityElement(int[] nums) {
        int cnt = 0;
        int target = nums[0];
        for(int num:nums){
            if(cnt==0){
                target = num;
            }
            if(target==num){
                cnt++;
            }else{
                cnt--;
            }
        }
        return target;
    }
}