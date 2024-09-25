class Solution {
    public int minOperations(String s) {
        int strt_with_0 = 0;        //010101......
        int strt_with_1 = 0;        //101010........

        //counting operations for start with zero
        for(int i = 0;i<s.length();i++){
            if(i%2 == 0){
                //even places
                if(s.charAt(i) != '0'){
                    strt_with_0++;
                }
            }
            else if(s.charAt(i)!= '1'){
                strt_with_0++;
            }
        }

        //counting operations for start with one
        for(int i = 0;i<s.length();i++){
            if(i%2 == 0){
                //even places
                if(s.charAt(i) != '1'){
                    strt_with_1++;
                }
            }
            else if(s.charAt(i)!= '0'){
                strt_with_1++;
            }
        }

    return Math.min(strt_with_0,strt_with_1);
    }
}