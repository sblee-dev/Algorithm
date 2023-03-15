import java.util.HashMap;
class Solution {
    public String solution(String letter) {
        HashMap<String, String> morse = new HashMap<>();
        String str = "'.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f','--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l','--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r','...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x','-.--':'y','--..':'z'";
        
        String[] str2 = str.replace("'", "").split(",");
        String[] str3 = {};
        for (int i=0; i<str2.length; i++) {
            str3 = str2[i].split(":");
            morse.put(str3[0], str3[1]);
        }
        
        String[] words = letter.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(morse.get(word));
        }
        return sb.toString();
    }
}