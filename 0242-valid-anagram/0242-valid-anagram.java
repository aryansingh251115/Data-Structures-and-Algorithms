class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i= 0 ;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i= 0 ;i<t.length();i++){
            char x = t.charAt(i);
            if(!map.containsKey(t.charAt(i))){
                return false;
            }else{
                map.put(t.charAt(i),map.get(t.charAt(i))-1);
                if(map.get(x)==0){
                    map.remove(x);
                }
            }
        }
        return map.isEmpty();
    }
}