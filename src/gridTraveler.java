import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class gridTraveler {
    private static int gridTravelCalc(int m, int n, HashMap memo) {
        List<Integer> coords = Arrays.asList(m,n);
        List<Integer> coordsRev = Arrays.asList(n,m);
        if (memo.containsKey(coords)) return((int)memo.get(coords));
        if (memo.containsKey(coordsRev)) return((int)memo.get(coordsRev));
        if (m == 0 || n == 0) return(0);
        if (m == 1 && n == 1) return(1);

        memo.put(coords, gridTravelCalc(m-1,n,memo) + gridTravelCalc(m,n-1,memo));
        return((int)memo.get(coords));
    }

    public static int gridTravel(int m, int n) {
        HashMap<List<Integer>,Integer> memo = new HashMap<>();
        return(gridTravelCalc(m, n, memo));
    }

    public static void main(String[] args) {
        System.out.println(gridTravel(18,17));
    }
}
