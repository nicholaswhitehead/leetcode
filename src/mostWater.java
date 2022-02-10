public class mostWater {
    public int maxArea(int[] height) {
        int area;
        int maxArea = Integer.MIN_VALUE;
        for (int i=0; i<height.length; i++) { // front wall of container
            if (height[i]*height.length-i-1 <= maxArea) continue;
            for (int j=i+1; j<height.length; j++) { // back wall of container
                area = Math.min(height[i], height[j]) * (j-i);
                if (area > maxArea) maxArea = area;
            }
        }
        return(maxArea);
    }

    public static void main(String[] args) {
        System.out.println(new mostWater().maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
