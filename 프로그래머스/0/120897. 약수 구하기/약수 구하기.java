import java.util.*;

class Solution {
    public int[] solution(int n) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        
        for (int i=1; i<=n; i++) {
            if (n % i == 0) set.add(i);
        }
        
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}