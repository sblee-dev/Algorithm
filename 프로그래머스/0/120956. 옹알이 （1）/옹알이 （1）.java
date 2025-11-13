import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int cnt = 0;
        List<String> arr = new ArrayList<>(Arrays.asList("aya", "ye", "woo", "ma"));
        
        for (int i=0; i<babbling.length; i++) {
            for (int j=0; j<arr.size(); j++) {
                babbling[i] = babbling[i].replace(arr.get(j), " ");    
            }
            if ("".equals(babbling[i].trim())) cnt++;
        }
        return cnt;
    }
}