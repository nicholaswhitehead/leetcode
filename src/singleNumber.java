import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class singleNumber {
    public int sinNumber(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i : nums) {
            if (hashMap.containsKey(i)) {
                hashMap.remove(i);
            } else {
                hashMap.put(i, i);
            }
        }
        Map.Entry<Integer, Integer> entry = hashMap.entrySet().iterator().next();
        return(entry.getKey());
    }

    public static void main(String[] args) {
        System.out.println(new singleNumber().sinNumber(new int[]{4,1,2,1,2}));
    }
}
