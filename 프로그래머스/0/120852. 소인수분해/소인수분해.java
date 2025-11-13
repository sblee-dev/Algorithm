import java.util.*;

class Solution {
    public int[] solution(int n) {

        List<Integer> list = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                while (n % i == 0) {
                    n = n / i;    
                }
                list.add(i);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}