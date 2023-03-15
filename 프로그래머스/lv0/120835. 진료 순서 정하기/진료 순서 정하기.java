import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[] e) {
        int[] result = new int[e.length];
        for (int i=0; i<e.length; i++) {
            int cnt = 1;
            for (int j=0; j<e.length; j++) {
                if (e[i] < e[j]) cnt++;
            }
            result[i] = cnt;
        }
        return result;
            
            
        // return Arrays.stream(e)
        // .map(i ->
        //         Arrays.stream(e)
        //      .boxed()
        //      .sorted(Comparator.reverseOrder())
        //      .collect(Collectors.toList())
        //      .indexOf(i) + 1
        //     )
        // .toArray();
    }
}