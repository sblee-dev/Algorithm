import java.util.stream.IntStream;
class Solution {
    public int solution(int n) {
        return (int) IntStream.rangeClosed(1, n).filter(i -> n%i==0).count();
        
        // int cnt = 0;
        // for (int i=1; i<=Math.sqrt(n); i++) {
        //     if ( n % i == 0 ) cnt += n/i == i ? 1 : 2;
        // }
        // return cnt;
    }
}