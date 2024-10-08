class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int ones =0;
        int zero = 0;
        for(int i : students){
            if(i ==0){
                zero++;
            }
            else{
                ones++;
            }
        }
        for(int i =0;i<sandwiches.length;i++){
            if(sandwiches[i] == 0){
                if(zero>0){
                    zero--;
                }
                else{
                    return ones;
                }
            }
            else{
                if(ones>0){
                    ones--;
                }
                else{
                    return zero;
                }
            }
        }
    return 0;
    }
}