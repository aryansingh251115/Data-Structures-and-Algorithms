class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> hs = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            hs.put(c, hs.getOrDefault(c, 0) + 1);
        }
        // Searching the element in the map
        for (int i = 0; i < t.length(); i++) {
            char d = t.charAt(i);
            if (!hs.containsKey(d)) {
                return d;
            } 
            else {
                hs.put(d, hs.get(d)-1);
                if (hs.get(d) == 0) {
                    hs.remove(d);
                }
            }
        }
    return ' ';
    }
}