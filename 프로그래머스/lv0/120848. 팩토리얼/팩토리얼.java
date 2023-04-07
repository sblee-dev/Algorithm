class Solution {
    public int solution(int n) {
        int i = 1;
        while (n > 0) {
            n /= i;
            if (n>0) i++;
        }
        return i-1;
    }
}