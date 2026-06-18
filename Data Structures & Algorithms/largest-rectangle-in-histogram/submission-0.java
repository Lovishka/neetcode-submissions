class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int maxarea=0;
        Stack<Integer> st=new Stack<>();


        for(int i=0;i<=n;i++){
            int currH=i==n?0:heights[i];

            while(!st.isEmpty() && heights[st.peek()]>currH){
                    int h=heights[st.pop()];
                    int w=st.isEmpty()?i:i-st.peek()-1;
                    maxarea=Math.max(maxarea,h*w);
            }
            st.push(i);
        
        }
        return maxarea;
    }

}
