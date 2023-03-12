import java.util.Arrays;
class Solution {
    public int solution(int[] array, int height) {
        Arrays.sort(array);
        int cnt = 0;
        for (int num : array) {
            if (num > height) cnt++;
        }
        return cnt;
    }
}