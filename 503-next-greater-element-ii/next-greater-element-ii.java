class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] nums1 = new int[2*n];

        for(int i=0;i<nums.length;i++){
            nums1[i] = nums[i];
            nums1[i+n] = nums[i];
        }

        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=nums1.length-1;i>=0;i--){
            int curr = nums1[i];

            while(!st.isEmpty() && st.peek() <= curr){
                st.pop();
            }
            if(i<n){
            if(st.isEmpty()){
                res[i] = -1;
            }
            else{
                res[i] = st.peek();
            }
            }
            st.push(curr);
        }
        return res;
        
    }
}