import java.util.*;

class Solution {
    public String solution(String my_string) {
        LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList(my_string.split("")));
        return String.join("", set);
    }
}