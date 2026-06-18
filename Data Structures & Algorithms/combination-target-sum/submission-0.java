class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        helper(0,nums,target,ans,list);
        return ans;
    }
    void helper(int idx,int[] nums,int target,List<List<Integer>> ans, List<Integer> list){
        if(target==0){
            ans.add(new ArrayList<>(list));
            return ;
        }
        if(idx>=nums.length ||  target<0 )return;

        if(nums[idx]<=target){
            list.add(nums[idx]);
            helper(idx,nums,target-nums[idx],ans,list);
            list.remove(list.size()-1);
        }
        helper(idx+1,nums,target,ans,list);
    }
}
