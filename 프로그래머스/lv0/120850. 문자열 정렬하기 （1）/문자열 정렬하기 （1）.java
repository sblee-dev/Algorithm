import java.util.Arrays;

class Solution {
    public int[] solution(String myString) {
        return Arrays.stream(myString.replaceAll("[a-z]", "").split("")).mapToInt(Integer::parseInt).sorted().toArray();
    }
}