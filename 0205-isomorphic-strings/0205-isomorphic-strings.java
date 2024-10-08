class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character ,Character> hs = new HashMap<>();
        HashMap<Character ,Character> hsrev = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if(hs.containsKey(sc)){
                if(hs.get(sc) !=tc ){
                    return false;
                }
            }
            else{
                  if(hsrev.containsKey(tc) && hsrev.get(tc) != sc){
                    return false;
                }  
                hs.put(sc,tc);
                hsrev.put(tc,sc);
            }
        }
    return true;
    }
}