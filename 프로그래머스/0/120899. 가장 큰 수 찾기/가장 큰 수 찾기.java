import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] array) {
        int[] res = new int[]{array[0], 0};
        
        for (int i=1; i<array.length; i++) {
            if (res[0] < array[i]) res = new int[]{array[i], i};
        }
        
        return res;
    }
}