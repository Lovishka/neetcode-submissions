class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
         helper(0,nums,ans,list);
         return ans;
    }
    void helper(int idx,int[] nums,List<List<Integer>> ans,List<Integer> list){
        if(idx>=nums.length){
            ans.add(new ArrayList<>(list));
            return;

        }
        list.add(nums[idx]);
        helper(idx+1,nums,ans,list);
        list.remove(list.size()-1);
        helper(idx+1,nums,ans,list);
    }
}
