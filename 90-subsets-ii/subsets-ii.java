class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);

        sub(new ArrayList<>(),nums,0,res);
        
        return res;
    }
    static void sub(List<Integer> list,int[] nums,int index,List<List<Integer>> res){
       
       res.add(new ArrayList<>(list));

       for(int i=index; i<nums.length; i++){
        if(i>index && nums[i] == nums[i-1]){
            continue;
        }
        list.add(nums[i]);
        sub(list,nums,i+1,res);
        list.remove(list.size() - 1);
       }

    }
}