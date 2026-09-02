class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();

        sub(new ArrayList<>(),nums,0,res);
        
        return res;
    }
    static void sub(List<Integer> list,int[] nums,int index,List<List<Integer>> res){

        if(index == nums.length){
            res.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[index]);
        //Taking 
        sub(list,nums,index+1,res);
        list.remove(list.size() - 1);
        //Not taking
        sub(list,nums,index+1,res);
        
    }
}