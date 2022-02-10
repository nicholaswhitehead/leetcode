import java.util.HashMap;

public class fib {
    public static int fibCalc(int n, HashMap memo) {
        if (memo.containsKey(n)) return (int) memo.get(n);
        if (n <= 2) return(1);

        memo.put(n, (fibCalc(n-1, memo) + fibCalc(n-2, memo)));
        return (int) memo.get(n);
    }

    private static int fib(int n) {
        HashMap<Integer,Integer> memo = new HashMap<>();
        return(fibCalc(n, memo));
    }

    public static void main(String args[]) {
        System.out.println(fib(6));
    }
}
