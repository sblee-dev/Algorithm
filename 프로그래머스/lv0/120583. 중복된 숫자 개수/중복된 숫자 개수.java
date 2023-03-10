import java.util.Arrays;
class Solution {
    public int solution(int[] array, int n) {
        return (int) Arrays.stream(array).filter(e -> e == n).count();
        
        // int result = 0;
        // for (int num : array) {
        //     if (num == n) result++;
        // }
        // return result;
    }
}