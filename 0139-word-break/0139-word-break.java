import java.util.*;

class TrieNode {
    TrieNode[] children;
    boolean isEndOfWord;

    TrieNode() {
        children = new TrieNode[26];  // a-z lowercase letters
        isEndOfWord = false;
    }
}

class Trie {
    private TrieNode root;

    Trie() {
        root = new TrieNode();
    }

    // Insert words into Trie
    public void insert(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.isEndOfWord = true;
    }

    public TrieNode getRoot() {
        return root;
    }
}

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Trie trie = new Trie();
        
        // ✅ Step 1: Insert all words from wordDict into Trie
        for (String word : wordDict) {
            trie.insert(word);
        }

        // ✅ Step 2: Memoization map (to store results for subproblems)
        Map<Integer, Boolean> memo = new HashMap<>();

        // ✅ Step 3: Backtracking with Memoization
        return backtrack(s, 0, trie.getRoot(), trie, memo);
    }

    private boolean backtrack(String s, int index, TrieNode root, Trie trie, Map<Integer, Boolean> memo) {
        if (index == s.length()) return true;  // \U0001f534 Base case: Reached end of string
        
        if (memo.containsKey(index)) return memo.get(index);  // \U0001f525 Memoization step
        
        TrieNode node = root;
        for (int i = index; i < s.length(); i++) {
            int charIndex = s.charAt(i) - 'a';
            if (node.children[charIndex] == null) {
                memo.put(index, false);  // ❌ If no match, store result & return false
                return false;
            }
            node = node.children[charIndex];

            if (node.isEndOfWord) {
                if (backtrack(s, i + 1, root, trie, memo)) {
                    memo.put(index, true);  // ✅ Store result for this index
                    return true;
                }
            }
        }
        
        memo.put(index, false);  // ❌ If no valid break found, store result
        return false;
    }
}
