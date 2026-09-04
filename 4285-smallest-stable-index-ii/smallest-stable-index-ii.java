class Solution {
    public int firstStableIndex(int[] nums, int k) {

        int n=nums.length;
        int max = nums[0];
        int min = nums[n-1];

        int[] prefix = new int[n];
        int[] suffix = new int[n];

        for(int i=0;i<nums.length;i++){

            max = Math.max(max,nums[i]);
            prefix[i] = max;
            min = Math.min(min,nums[n-i-1]);
            suffix[n-i-1] = min;
        }
        
        for(int i=0;i<nums.length;i++){
            if(prefix[i] - suffix[i] <= k) return i;
        }

        return -1;
    }
}