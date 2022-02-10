public class mountainArray {
    public boolean validMountainArray(int[] arr) {
        int i = 0;
        int prev = arr[0]-1;
        while (i < arr.length) {
            if (arr[i] <= prev) break;
            prev = arr[i];
            i++;
        }
        if (i == 1 || i == arr.length) return(false);
        while (i < arr.length) {
            if (arr[i] >= prev) return(false);
            prev = arr[i];
            i++;
        }
        return(true);
    }

    public static void main(String[] args) {
        System.out.println(new mountainArray().validMountainArray(new int[]{0,3,2,1}));
    }
}
