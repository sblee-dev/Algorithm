class Solution {
    public String solution(int age) {
        String[] age962 = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        String answer = "";
        
        while(age > 0) {
            answer = age962[age%10] + answer;
            age /= 10;
        }
        return answer;
    }
}