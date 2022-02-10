import java.util.Arrays;

public class jumpGameLinear {
    public static boolean canJump(int[] nums) {
        int distance = 1;
        for (int i=2; i<nums.length; i++) {
            if (nums[nums.length-i] >= distance) {
                return(canJump(Arrays.copyOfRange(nums, 0, nums.length-i)));
            }
            if (nums.length-i-1 == 0) return(false);
            distance++;
        }
        return(true);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,5,0,0};
        System.out.println(canJump(nums));
    }
}
