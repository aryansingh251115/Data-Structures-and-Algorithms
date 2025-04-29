class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i =0 ;
        int j = 0;
        int maxlen = 0;
        HashSet<Character> st = new HashSet<>();
        while(j<s.length()){
            char temp = s.charAt(j);
            if(st.contains(temp)){
                while(st.contains(temp) &&i<=j){
                    st.remove(s.charAt(i));
                    i++;
                }
                st.add(temp);
            }
            else{
                st.add(temp);
            }
            maxlen = Math.max(maxlen,j-i+1);
            j++;
        }
    return maxlen;
    }
}