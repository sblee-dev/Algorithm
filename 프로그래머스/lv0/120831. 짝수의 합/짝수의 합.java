import java.util.stream.*;
import java.util.Arrays;
class Solution {
    public int solution(int n) {
        return IntStream.rangeClosed(0, n).filter(i -> i%2==0).sum();
    }
}