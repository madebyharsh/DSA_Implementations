import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2,34,1,34,134,75,75,3,23};
        Utility.mergeSort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
}