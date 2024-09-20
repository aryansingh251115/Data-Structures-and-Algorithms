class Solution {
    public int maxScore(String s) {
        int i = 1;
        int max = Integer.MIN_VALUE;
        int current = 0;
        while(i<s.length()){
            String left = s.substring(0,i);
            String right= s.substring(i,s.length());
            i++;
            current = zeroes(left) + ones(right);
            if(current>max){
                max = current;
            }
        }
    return max;
    }

    private int zeroes(String str){
        int count = 0;
        for(int i = 0; i<str.length();i++){
            char s = str.charAt(i);
            if(s == '0'){
                count++;
            }
        }
    return count;
    }

    
    private int ones(String str){
        int count = 0;
        for(int i = 0; i<str.length();i++){
            char s = str.charAt(i);
            if(s == '1'){
                count++;
            }
        }
    return count;
    }
}