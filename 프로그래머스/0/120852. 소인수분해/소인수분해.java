import java.util.LinkedHashSet;

class Solution {
    public int[] solution(int n) {
        
        LinkedHashSet<Integer> list = new LinkedHashSet<>();
        
        int i = 2;
        
        while (i <= n) {
            if (n % i == 0) {
                list.add(i);
                n /= i;    
            } else {
                i++;
            } 
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}