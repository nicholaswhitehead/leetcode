import java.util.HashMap;

public class jumpGame {
    static int target;

    public static boolean canJump(int[] nums) {
        target = nums.length-1;
        HashMap<Integer,Integer> memo = new HashMap<>();
        return(canJumpCalc(nums, 0, memo)>0);
    }

    private static int canJumpCalc(int[] nums, int index, HashMap memo) {
        if (index == target || nums[index]+index >= target) return(1);
        if (nums[index] == 0) return(0);
        int count = 0;
        for (int jump=1; jump<=nums[index]; jump++) {
            if (memo.containsKey(index+jump)) {
                memo.put(index, memo.get(index+jump));
                count += (int)memo.get(index);
            } else if (index+jump < nums.length) {
                if (nums[index+jump] < (nums[index]-jump)) continue;
                memo.put(index, canJumpCalc(nums, index+jump, memo));
                count += (int)memo.get(index);
            } else {
                break;
            }
        }
        return(count);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,5,0,0};
        System.out.println(canJump(nums));
    }
}
