import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n) {
        return IntStream.rangeClosed(1, n).filter(x -> n % x == 0).toArray();
    }
}