class Solution {
    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> res = new ArrayList<>();

        com(new ArrayList<>(),1,n,k,res);
        //start is from 1 -> [1,n]
        return res;
    }
    static void com(List<Integer> list,int start,int n,int k,List<List<Integer>> res){

        //this is similar to the subset2 only differ is the baseCase
        if(list.size() == k){
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i=start;i<=n;i++){
            list.add(i);
            com(list,i+1,n,k,res);
            list.remove(list.size() - 1);
        }
    }
}