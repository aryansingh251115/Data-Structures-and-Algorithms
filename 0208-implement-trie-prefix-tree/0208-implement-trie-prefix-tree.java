class Trie {

    Trie[] arr = new Trie[26];
    boolean eow = false;

    public Trie() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = null;
        } 
    }

    public void insert(String word) {
        Trie curr = this;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.arr[idx] == null) {
                curr.arr[idx] = new Trie();
            }
            curr = curr.arr[idx];
        }
        curr.eow = true;

    }

    public boolean search(String word) {
        Trie curr = this;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.arr[idx] == null) {
                return false;
            }
            curr = curr.arr[idx];
        }
        return curr.eow;
    }

    public boolean startsWith(String prefix) {
        Trie curr = this;
        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';
            if (curr.arr[idx] == null) {
                return false;
            }
            curr = curr.arr[idx];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */