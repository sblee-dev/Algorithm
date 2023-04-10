// import java.lang.StringBuilder;
import java.util.stream.Collectors;
class Solution {
    public String solution(String my_string) {
        
        return my_string.chars().mapToObj(operand -> String.valueOf((char) (Character.isLowerCase(operand) ? Character.toUpperCase(operand) : Character.toLowerCase(operand)))).collect(Collectors.joining());
        
        // StringBuilder sb = new StringBuilder();
        // for (char str : my_string.toCharArray()) {
        //        if (str < 97) {
        //            sb.append((char) (str + 32));
        //        } else {
        //            sb.append((char) (str - 32));
        //        }
        // }
        // return sb.toString();
    }
}