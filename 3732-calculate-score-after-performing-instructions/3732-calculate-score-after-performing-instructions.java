class Solution {
    public long calculateScore(String[] ins, int[] values) {
        long score = 0 ;
        int i = 0;
        int arr[] = new int[ins.length];
        while(i < ins.length){
            if(i<0 || i>= ins.length || arr[i] == 1){
                break;
            }
            if(ins[i].equals("add")){
                score += values[i];
                arr[i] = 1;
                i++;
            }
            else{
                arr[i] = 1;
                i += values[i];
                
            }
        }
    return score;
    }
}