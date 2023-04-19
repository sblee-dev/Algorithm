class Solution {
    public int solution(String s) {
        int sum = 0;
        String[] list = s.split(" ");
        for (int i=0; i<list.length; i++) {
            if (i >0 && list[i].equals("Z")) {
                sum -= Integer.parseInt(list[i-1]);
            } else {
                sum += Integer.parseInt(list[i]);
            }
        }
        return sum;
    }
}