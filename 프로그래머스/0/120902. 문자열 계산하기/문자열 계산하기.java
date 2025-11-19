class Solution {
    public int solution(String my_string) {
        String[] list = my_string.split(" ");
        int res = Integer.valueOf(list[0]);
        
        for (int i=1; i<list.length; i++) {
            if ("+".equals(list[i])) {
                i++;
                res += Integer.valueOf(list[i]);
            } else if ("-".equals(list[i])) {
                i++;
                res -= Integer.valueOf(list[i]);
            }
        }
        return res;
    }
}