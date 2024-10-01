class Solution {
    public String maximumOddBinaryNumber(String s) {
        String n = "";
        ArrayList<Character> arr1 = new ArrayList<>();
        ArrayList<Character> arr2 = new ArrayList<>();
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '1'){
                arr1.add(c);
            }
            else{
                arr2.add(c);
            }
        }
        for(int i = 0 ;i<arr1.size()-1;i++){
            n+=arr1.get(i);
        }
        for(int i = 0;i<arr2.size();i++){
            n+=arr2.get(i);
        }
        n+=arr1.get(0);
    return n;
    }
}