import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
        return Arrays.stream(s.split(""))
                .filter(x -> s.indexOf(x) == s.lastIndexOf(x))
                .sorted()
                .collect(Collectors.joining());
    }
}