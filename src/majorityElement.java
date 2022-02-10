import java.util.HashMap;

public class majorityElement {
    public int majElement(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int maxNum = nums[0];
        for (int num : nums) {
            if (hashMap.containsKey(num)) {
                int val = hashMap.get(num);
                hashMap.replace(num, val+1);
                if (val+1 >= max) {
                    max = val+1;
                    maxNum = num;
                }
            } else {
                hashMap.put(num, 1);
            }
        }
        return(maxNum);
    }

    public static void main(String[] args) {
        System.out.println(new majorityElement().majElement(new int[]{1}));
    }
}
