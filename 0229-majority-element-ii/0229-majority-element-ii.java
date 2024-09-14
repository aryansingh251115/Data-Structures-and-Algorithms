//Done without hint or help
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        //creating new list to return
        ArrayList<Integer> lst = new ArrayList<>();
        //creating a hashmap to store
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i = 0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }

        Set<Integer> keys = hm.keySet();
        for(Integer k :keys){
            if(hm.get(k)>n/3){
                lst.add(k);
            }
        }
        return lst;

    }
}