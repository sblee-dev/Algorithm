import java.time.*;
class Solution {
    public int solution(int age) {
        LocalDate today = LocalDate.now();
        return today.getYear() - age;
    }
}