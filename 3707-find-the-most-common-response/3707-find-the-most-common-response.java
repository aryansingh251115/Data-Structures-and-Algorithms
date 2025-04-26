class Solution {
    public String findCommonResponse(List<List<String>> res) {
        HashMap<String,Integer> hm = new HashMap<>();
        String ans = "";
        int maxFreq = 0;
        for(List<String> lst : res){
            HashSet<String> st = new HashSet<>(lst);    //removes duplicate
            for(String str : st){
                hm.put(str , hm.getOrDefault(str,0)+1);
            }
        }

        //checking for the greatest value
        for(String str : hm.keySet()){
            int freq = hm.get(str);
            if(maxFreq < freq || (maxFreq == freq && str.compareTo(ans) < 0)){
                maxFreq = freq;
                ans = str;
            }
        }
    return ans;
    }
}





















// class Solution {
//     public String findCommonResponse(List<List<String>> res) {
//         HashMap<String,Integer> hm = new HashMap<>();
//         for(List<String> lst : res){
//             HashSet<String> st = new HashSet<>(lst);
//             for(String resp : st){
//                 hm.put(resp,hm.getOrDefault(res,0)+1);      
//             }
//         }
//         int maxFreq = 0;
//         String ans = "";
//         for(String temp : hm.keySet()){
//             int freq = hm.get(temp);
//             if(freq > maxFreq  || (freq == maxFreq && temp.compareTo(ans)<0)){
//                ans = temp;
//                maxFreq = freq;
//             }
//         }
//     return ans;

        
//         // for(hm.Entry<String,Integer> temp : hm.entrySet()){
//         //     String ans = "";
//         //     int freq = 0;
//         //     if(temp.get())
//         // }
//     }
    
// }