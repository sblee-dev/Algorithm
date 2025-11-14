class Solution {
    public int solution(int[] array, int n) {
        int num = array[0];
        
        for (int i=0; i<array.length; i++) {
            if (Math.abs(array[i] - n) < Math.abs(num - n)) {
                num = array[i];
            } else if (Math.abs(array[i] - n) == Math.abs(num - n)) {
                if (array[i] < num) {
                    num = array[i];
                } 
            }
        }
        
        return num;
    }
}