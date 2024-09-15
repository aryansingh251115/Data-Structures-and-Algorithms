class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int len = 0;
        for (int i = 0; i < chars.length(); i++) {
            char c = chars.charAt(i);
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < words.length; i++) {
        boolean wordform = true;
            HashMap<Character, Integer> hmcopy = new HashMap<>(hm);
            String s = words[i];
            for (int j = 0; j < s.length(); j++) {
                char d = s.charAt(j);
                if (hmcopy.containsKey(d)) {
                    hmcopy.put(d, hmcopy.get(d) - 1);
                    if (hmcopy.get(d) == 0) {
                        hmcopy.remove(d);
                    }
                } else {
                    wordform = false;
                    break;

                }
            }
            if(wordform == true){
                len += words[i].length();
            }
        }
        return len;
    }
}
