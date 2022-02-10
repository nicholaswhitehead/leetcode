public class divide {
    public int intDivide(int dividend, int divisor) {
        int sign = (Integer.signum(dividend)==Integer.signum(divisor)) ? 1 : -1;
        dividend = (dividend == Integer.MIN_VALUE) ? Math.abs(dividend+1) : Math.abs(dividend);
        divisor = (divisor == Integer.MIN_VALUE) ? Math.abs(divisor+1) : Math.abs(divisor);
        int sum = divisor;
        int count = 1;
        int prevSum = 1;
        int prevCount = 1;

        System.out.println(dividend + " " + divisor);
        while (sum <= dividend && Integer.signum(sum) == Integer.signum(prevSum)) {
            prevSum = sum;
            sum = sum << 1;
            prevCount = count;
            count = count << 1;
            // System.out.println(sum + "_" + count);
        }
        sum = prevSum;
        count = prevCount;
        System.out.println(sum + " " + count);
        while (sum <= dividend) {
            sum+=divisor;
            count++;
            System.out.println(sum + " " + count);
        }
        return (count-1)*sign;
    }

    public static void main(String[] args) {
        System.out.println(new divide().intDivide(-10, 3));
        System.out.println(new divide().intDivide(-2147483648, -1));
    }
}
