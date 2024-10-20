class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder str = new StringBuilder();
        int j = 0;
        char c[] = word.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == ch) {
                j = i;
                break;
            }
            j = -1;
        }

        if (j == -1) {
            return word;
        } else {
            for (int i = j; i >= 0; i--) {
                str.append(word.charAt(i));
            }
            str.append(word.substring(j+1,word.length()));
            return str.toString();
        }
    }
}