class Solution {
    public int solution(int i, int j, int k) {
        int cnt = 0;
        String kStr = String.valueOf(k);
        for (int x=i; x<=j; x++) {
            String s = String.valueOf(x);
            for (char c : s.toCharArray()) {
                if (c == kStr.charAt(0)) cnt++;    
            }
        }
        return cnt;
    }
}