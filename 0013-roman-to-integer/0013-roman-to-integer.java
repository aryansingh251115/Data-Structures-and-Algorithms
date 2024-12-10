class Solution {
    public int romanToInt(String s) {
       HashMap<Character,Integer> hm  = new HashMap<>();
       hm.put('I',1); 
       hm.put('V',5); 
       hm.put('X',10); 
       hm.put('L',50); 
       hm.put('C',100); 
       hm.put('D',500); 
       hm.put('M',1000);
        int res = 0;
       for(int i = 0;i<s.length();i++){
        int temp = 0;
        char c = s.charAt(i);
        if(i+1 <s.length() && hm.get(c)<hm.get(s.charAt(i+1))){
            temp = hm.get(s.charAt(i+1)) - hm.get(s.charAt(i));
            res += temp;
            i++;
        }
        else{
            temp = hm.get(s.charAt(i));
            res += temp;
        }
       } 
    return res;
    }
}