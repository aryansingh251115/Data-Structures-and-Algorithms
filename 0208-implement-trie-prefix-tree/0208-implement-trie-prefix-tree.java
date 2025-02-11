class Trie {
    static class TrieNode{
        boolean eow;
        TrieNode children[];

        TrieNode(){
            children  = new TrieNode[26];
            eow = false; 
        }
    }
    private TrieNode root;

    Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode curr = root;
        for(int i = 0;i<word.length();i++){
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new TrieNode();
            }
        curr = curr.children[idx];
        }
        curr.eow = true;
    }
    
    public boolean search(String word) {
        TrieNode curr = root;
        for(int i = 0;i<word.length();i++){
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
        curr = curr.children[idx];
        }
        return curr.eow;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode curr = root;
        int i =0;
        for(i = 0;i<prefix.length();i++){
            int idx = prefix.charAt(i) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
        curr = curr.children[idx];
        }
    return i == prefix.length();
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */