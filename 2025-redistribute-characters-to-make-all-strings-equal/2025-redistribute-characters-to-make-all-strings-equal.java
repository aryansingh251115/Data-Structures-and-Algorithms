// Done by myself
class Solution {
    public boolean makeEqual(String[] words) {
        // HashMap to store the frequency of each character across all words
        HashMap<Character, Integer> hm = new HashMap<>();
        
        // Loop through each word in the array
        for (String s : words) {
            // Loop through each character in the current word
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i); // Get the current character
                
                // If the character already exists in the map, increment its count
                if (hm.containsKey(c)) {
                    hm.put(c, hm.get(c) + 1);
                } 
                // If the character does not exist in the map, add it with a count of 1
                else {
                    hm.put(c, 1);
                }
            }
        }
        
        // Check if the frequency of each character is divisible by the number of words
        for (Character d : hm.keySet()) {
            // If the frequency of any character is not divisible by the number of words, return false
            if (hm.get(d) % words.length != 0) {
                return false;
            }
        }
        
        // If all character frequencies are divisible by the number of words, return true
        return true;
    }
}
