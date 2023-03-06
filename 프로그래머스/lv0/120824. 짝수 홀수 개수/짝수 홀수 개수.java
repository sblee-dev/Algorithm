class Solution {
    public int[] solution(int[] num_list) {
        int[] list = new int[2];
        for (int num : num_list) {
            list[num % 2]++;
        }
        return list;
    }
}