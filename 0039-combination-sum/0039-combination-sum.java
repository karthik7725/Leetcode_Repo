class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public void findCombinations(int ind, int target, List<Integer> ds, int[] a) {
        if (ind == a.length) {
            if (target == 0) {
                res.add(new ArrayList<>(ds));    
            }
            return;   
        }

        if (a[ind] <= target) {
            ds.add(a[ind]);
            findCombinations(ind, target - a[ind], ds, a);          //left subtree
            ds.remove(ds.size() - 1);
             }
            findCombinations(ind + 1, target, ds, a);               //right subtree
        }
    

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        findCombinations(0, target, new ArrayList<Integer>(), candidates);
        return res;
    }
}