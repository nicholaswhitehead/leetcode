import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class singleNumberII {
    public int sinNumber(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i : nums) {
            if (hashMap.containsKey(i)) {
                if (hashMap.get(i) == 2) {
                    hashMap.remove(i);
                } else {
                    hashMap.replace(i, 2);
                }
            } else {
                hashMap.put(i, 1);
            }
        }
        Map.Entry<Integer, Integer> entry = hashMap.entrySet().iterator().next();
        return(entry.getKey());
    }

    public static void main(String[] args) {
        System.out.println(new singleNumber().sinNumber(new int[]{4,1,2,1,2}));
    }
}
