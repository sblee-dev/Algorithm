class Solution {
    public String solution(String rsp) {
        String[] str = rsp.split("");
        String result = "";
        for (String s : str) {
            if (s.equals("2")) {
                result += "0";    
            } else if (s.equals("0")) {
                result += "5";
            } else {
                result += "2";
            }
        }
        return result;
    }
}