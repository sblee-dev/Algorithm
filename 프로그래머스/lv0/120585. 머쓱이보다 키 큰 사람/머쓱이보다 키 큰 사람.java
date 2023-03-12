import java.util.Arrays;
class Solution {
    public int solution(int[] array, int height) {
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, height);
        if (index < 0) {
            return array.length + index + 1;
        } else {
            return array.length - index - 1;
        }
    }
}