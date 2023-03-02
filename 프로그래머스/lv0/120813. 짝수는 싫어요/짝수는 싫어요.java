import java.util.stream.IntStream;
class Solution {
    public int[] solution(int n) {
        return IntStream.rangeClosed(1, n).filter(val -> val % 2 == 1).toArray();
    }
}