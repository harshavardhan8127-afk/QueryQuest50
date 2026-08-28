class Solution {
    public int[] concatWithReverse(int[] nums) {

        int[] res = new int[2*nums.length];
        for(int i = 0;i<nums.length;i++){
            res[i] = nums[i];
            res[i+nums.length] = nums[nums.length - i - 1];
        }
        return res;   
    }
}