import java.util.regex.*;

class Solution-10 {
    public boolean isMatch(String s, String p) {
        return Pattern.compile(p).matcher(s).matches();
    }
}