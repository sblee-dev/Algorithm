import java.math.BigInteger;
class Solution {
    public BigInteger solution(int balls, int share) {
        if (balls == share) {
            return BigInteger.valueOf(1);
        } else {
            return fac(balls).divide((fac(balls-share).multiply(fac(share))));
        }
    }
    
    public BigInteger fac(int num) {
        BigInteger result = new BigInteger("1");
        for (int i=1; i<=num; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}