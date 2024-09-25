class Solution {
    public boolean makeEqual(String[] words) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(String s : words){
            for(int i = 0 ; i < s.length();i++){
                char c = s.charAt(i);
                if(hm.containsKey(c)){
                    hm.put(c,hm.get(c)+1);
                }
                else{
                    hm.put(c,1);
                }
            }
        }
        for(Character d : hm.keySet()){
            if(hm.get(d) %  words.length != 0){
                return false;
            }
        }
    return true;
    }
}