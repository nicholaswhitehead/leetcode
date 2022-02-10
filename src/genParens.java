import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class genParens {
    public static List<String> generateParenthesis(int n) {
        List<String> output = new ArrayList<>();
        output.addAll(addParens(n, "", 0, 0));
        return(output);
    }

    private static List<String> addParens(int n, String str, int open, int closed) {
        List<String> newOut = new ArrayList<>();
        if (open < n) {
            String newStr = str + "(";
            newOut.addAll(addParens(n, newStr, open+1, closed));
        }
        if (closed < open) {
            String newStr = str + ")";
            newOut.addAll(addParens(n, newStr, open, closed+1));
        }
        if (open == n && closed == n) {
            newOut.add(str);
        }

        return(newOut);
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }

}
