class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        ArrayList<Integer> lstfinal = new ArrayList<>();
        Set<Integer> lst = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();

        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            set2.add(i);
        }
        for (int i : nums3) {
            set3.add(i);
        }

        for (int i : set1) {
            if (set3.contains(i) || set2.contains(i)) {
                lst.add(i);
            }
        }

        for (int i : set2) {
            if (set3.contains(i)) {
                lst.add(i);
            }
        }

        return new ArrayList<>(lst);
    }
}

// my approach but this is not possible but this is very intresting approach
// so,read once.

// class Solution {
// public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
// ArrayList <Integer> lst = new ArrayList<>();
// HashMap<Integer,Integer> hm = new HashMap<>();
// for(int i =0;i<nums1.length;i++){
// hm.put(nums1[i] ,1);
// }

// for(int i =0;i<nums2.length;i++){
// if(hm.containsKey(nums2[i]) ){
// hm.put(nums2[i],2);
// }
// else if(!hm.containsKey(nums2[i])){
// hm.put(nums2[i] , 1);
// }
// }

// for(int i =0;i<nums3.length;i++){
// if(hm.containsKey(nums3[i])){
// hm.put(nums3[i],3);
// }
// else if(!hm.containsKey(nums3[i])){
// hm.put(nums3[i] , 1);
// }
// }

// for(int key : hm.keySet()){
// if(hm.get(key) >= 2){
// lst.add(key);
// }
// }
// return lst;
// }
// }
