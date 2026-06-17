class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
       Set<Character> set=new HashSet<>();
       int i=0,j=0;
       int max=0;


        while(i<n && j<n){
                if(!set.contains(s.charAt(j))){
                    set.add(s.charAt(j));
                    int len=j-i+1;
                    j++;
                    max=Math.max(len,max);
                }
                else{
                    set.remove(s.charAt(i));
                    i++;
                }
        }
        return max;
    }
}
