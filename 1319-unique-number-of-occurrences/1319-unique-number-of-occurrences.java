//Help Taken 60%
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            hs.put(arr[i],hs.getOrDefault(arr[i],0)+1);
        }
        Set<Integer> freqcounter = new HashSet<>();
        for(int frequency : hs.values()){
            if(!freqcounter.add(frequency)){
                return false;
            }
        }
    return true;
    }
}