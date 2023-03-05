class Solution {
    public String solution(String my_string) {
        String[] string = my_string.split("");
        String[] list = new String[string.length];
        
        for(int i=0; i<string.length; i++) {
            list[i] = string[string.length-i-1];
        }
        
        return String.join("", list);
    }
}