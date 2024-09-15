// //help taken for developing approach of question

// //using hashset

// class Solution {
//     public char findTheDifference(String s, String t) {
//         HashMap<Character, Integer> hs = new HashMap<>();
//         for (int i = 0; i < s.length(); i++) {
//             char c = s.charAt(i);
//             hs.put(c, hs.getOrDefault(c, 0) + 1);
//         }
//         // Searching the element in the map
//         for (int i = 0; i < t.length(); i++) {
//             char d = t.charAt(i);
//             if (!hs.containsKey(d)) {
//                 return d;
//             } 
//             else {
//                 hs.put(d, hs.get(d)-1);
//                 if (hs.get(d) == 0) {
//                     hs.remove(d);
//                 }
//             }
//         }
//     return ' ';
//     }
// }

//using XOR operations

class Solution {
    public char findTheDifference(String s, String t) {
        char result = 0;
        for(int i = 0;i<s.length();i++){
            result ^=s.charAt(i);
        }

        for(int i = 0;i<t.length();i++){
            result ^=t.charAt(i);
        }
        return result;
        
    }
}