class Solution {
    public int removeDuplicates(int[] nums) {
        int pointer = 1;
        for(int i=1; i<nums.length;i++){
            if(pointer == 1 || nums[i]!=nums[pointer-2]){
                nums[pointer++] = nums[i];
            }
        }
        return pointer;
    }
}