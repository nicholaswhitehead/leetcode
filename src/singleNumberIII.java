import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class singleNumberIII {
    public int[] sinNumber(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i : nums) {
            if (hashMap.containsKey(i)) {
                hashMap.remove(i);
            } else {
                hashMap.put(i, i);
            }
        }
        int[] vals = new int[2];
        int i = 0;
        for (int val : hashMap.values()) {
            vals[i++] = val;
        }
        return(vals);
    }

    public static void main(String[] args) {
        System.out.println(new singleNumber().sinNumber(new int[]{4,1,2,1,2}));
    }
}
