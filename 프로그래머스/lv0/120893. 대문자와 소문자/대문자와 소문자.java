import java.lang.StringBuilder;
class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        for (char str : my_string.toCharArray()) {
               if (str < 97) {
                   sb.append((char) (str + 32));
               } else {
                   sb.append((char) (str - 32));
               }
        }
        return sb.toString();
    }
}