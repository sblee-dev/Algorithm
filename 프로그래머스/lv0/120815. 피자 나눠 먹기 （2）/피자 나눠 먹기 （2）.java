class Solution {
    public int solution(int n) {
        return n / gcd(n, 6);
    }
    
    public int gcd(int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        } 
        if (b == 0) return a;
        
        return gcd(b, a%b);
        
    }
}