import java.lang.Math;
class Solution {
    public int solution(int n) {
        int cnt = 0;
        for (int i=1; i<=Math.sqrt(n); i++) {
            if ( n % i == 0 ) cnt += n/i == i ? 1 : 2;
        }
        return cnt;
    }
}