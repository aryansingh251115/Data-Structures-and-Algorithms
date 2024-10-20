import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> stringSequence(String target) {
        ArrayList<String> arr = new ArrayList<>();
        StringBuilder s = new StringBuilder(); 
        for (char i : target.toCharArray()) {
            char d = 'a';
            while (d < i) {
                arr.add(s.toString() + String.valueOf(d));
                d++;
            }
            s.append(i);
            arr.add(s.toString()); 
        }
        
        return arr;
    }
}