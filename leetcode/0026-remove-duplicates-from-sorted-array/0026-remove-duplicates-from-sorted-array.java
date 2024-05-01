class Solution {
    public int removeDuplicates(int[] nums) {
        int inx = 1;
        int before = nums[0];
        for(int i=0;i<nums.length;i++){
            if(before==nums[i])continue;
            nums[inx] = nums[i];
            before=nums[inx++];
        }
        return inx;
    }
}