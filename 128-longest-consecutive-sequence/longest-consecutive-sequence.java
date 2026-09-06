class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length==0) return 0;

        Arrays.sort(nums);
        int len = 1;
        int maxLen = 1;

        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1] - nums[i] == 1) len++;
            else if(nums[i+1] == nums[i]) continue;
            else len = 1;
            maxLen = Math.max(maxLen,len);
        }

        return maxLen;
    }
}