class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> hs = new HashSet<>(wordDict);
        Boolean dp[] = new Boolean[s.length()];
        return helper(s,hs,0 , dp);
    }

    public boolean helper(String s , Set<String> hs , int idx , Boolean arr[]){
        if(idx == s.length()) return true;
        if(arr[idx] != null) return arr[idx];
        for(int i =idx+1 ; i<= s.length();i++){
            if(hs.contains(s.substring(idx,i)) && helper(s, hs , i , arr)){
                
                return arr[idx] = true;
            }
        }
        
    return arr[idx] = false;
    }
}