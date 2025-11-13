import java.util.LinkedHashSet;

class Solution {
    public int[] solution(int n) {
        
        LinkedHashSet<Integer> list = new LinkedHashSet<>();
        
        for (int i = 2; i <= n; i++) {
            while (i <= n && n % i == 0) {
                list.add(i);
                n /= i;
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}