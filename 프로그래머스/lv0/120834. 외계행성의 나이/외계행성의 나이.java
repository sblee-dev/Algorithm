class Solution {
    public String solution(int age) {
        String[] age962 = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        String[] str = Integer.toString(age).split("");
        String answer = "";
        for (String s : str) {
            answer += age962[Integer.parseInt(s)];
        }
        return answer;
    }
}