class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int minInd = 0;
        int maxInd = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] > nums[maxInd]) maxInd = i;
            if(nums[i] < nums[minInd]) minInd = i;
        }

        int front = Math.max(minInd,maxInd) + 1;
        int back = n - Math.min(minInd,maxInd);
        int both = Math.min(minInd,maxInd) + 1 + n - Math.max(minInd,maxInd);

        return Math.min(front,Math.min(back,both));
    }
}