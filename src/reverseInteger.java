import java.util.LinkedList;
import java.util.List;

public class reverseInteger {
    public int reverse(int x) {
        // extract, store sign
        // insert int into linked list
        // reverse linked list
        // check if can be converted to int -> return int / return 0 (can check by checking sign of penultimate value)

        int sign = Integer.signum(x);
        int xabs = Math.abs(x);
        if (xabs == x && sign == -1) {
            return 0;
        }
        int nDigits = (int)Math.log10(xabs)+1;
        int xout = 0;

        for (int i=nDigits-1; i>=0; i--) {
            xout += xabs%10 * Math.pow(10,i);
            xabs = xabs/10;

            if (xout == Integer.MAX_VALUE) {
                return 0;
            }
        }
        return xout*sign;
    }

    public static void main(String[] args) {
        System.out.println(new reverseInteger().reverse(-2147483648));
    }
}
