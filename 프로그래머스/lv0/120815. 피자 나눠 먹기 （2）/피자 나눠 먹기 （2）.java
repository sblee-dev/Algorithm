class Solution {
    public int solution(int n) {
        return n / GCD(n, 6);
    }
    
    public int GCD(int num1, int num2) {
        if (num1 % num2 == 0)
            return num2;
        return GCD(num2, num1 % num2);
    }
}