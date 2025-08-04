class Solution {
    public boolean checkValidString(String s) {

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '*') {
                count++;
            } else {
                count--;
            }
            if (count < 0) {
                return false;
            }
        }
count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ')' || s.charAt(i) == '*') {
                count++;
            } else {
                count--;
            }
            if (count < 0) {
                return false;
            }
        }
        return true;
    }
}

/*
lengthy approach


class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> open = new Stack<>();
        Stack<Integer> star = new Stack<>();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '('){
                open.push(i);
            }
            else if(s.charAt(i) == ')'){
                if(!open.isEmpty()){
                    open.pop();
                }else if(!star.isEmpty()){
                    star.pop();
                }else {
                    return false;
                }
            }
            else{
                star.push(i);
            }
        }
        while(!open.isEmpty()  && !star.isEmpty()){
            int openNum = open.pop();
            int starNum = star.pop();
            if(openNum > starNum){
                return false;
            }
        }
       return open.isEmpty();
    }
}





//wrong approach

class Solution {
    public boolean checkValidString(String s) {
        int open = 0;
        int close = 0;
        int star = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '('){
                open++;
            }
            else if(s.charAt(i) == ')'){
                close++;
            }
            else{
                star++;
            }
        }
        if(open == close || open+star == close || close +star == open){
            return true;
        }
        return false;
    }
}

*/