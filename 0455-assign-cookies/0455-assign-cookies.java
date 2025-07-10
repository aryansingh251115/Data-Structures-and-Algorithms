class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int ans = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int idxG = 0;
        int idxS = 0;
        while(idxG <g.length && idxS <s.length){
            if(g[idxG] <= s[idxS]){
                ans++;
                idxG++;
                idxS++;
            }
            else if(g[idxG] > s[idxS]){
                idxS++;
            }
        }
        return ans;

    }
}