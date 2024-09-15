//we can't use nested for loop as it prints the element every time like in first 
//given example it will prints [2,2] instead of [2].
class Solution { 
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> lst = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            hm.put(nums1[i], hm.getOrDefault(nums1[i],0)+1);
        }
        for(int i=0;i<nums2.length;i++){
            if(hm.containsKey(nums2[i])){
                lst.add(nums2[i]);
                hm.remove(nums2[i]);
            }
        }
        int arr[] = new int[lst.size()];
        for(int i =0;i<lst.size();i++){
            arr[i] = lst.get(i);
        }
    return arr;
    }
}