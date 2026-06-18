class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        int cookie=0,child=0;

        while(cookie<s.length && child<g.length){
            if(g[child]<=s[cookie]){
                child++;
            }
            cookie++;
        }
        return child;
    }
}