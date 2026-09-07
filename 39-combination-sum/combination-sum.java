class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

       List<List<Integer>> res = new ArrayList<>();

        helper(0, candidates, target, new ArrayList<>(), res);

        return res;
    }
    static void helper(int index, int[] candidates, int target,List<Integer> p, List<List<Integer>> res){

         if (target == 0) {
            res.add(new ArrayList<>(p));
            return;
        }
        if (index == candidates.length || target < 0)  return;

        //take
        p.add(candidates[index]);
        helper(index, candidates, target - candidates[index], p, res);
        p.remove(p.size() - 1);
        //dont take
        helper(index+1,candidates,target,p,res);
    }
}