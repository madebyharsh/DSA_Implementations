public class Utility {
    public static void mergeSort(int[] nums, int st, int ed){
        devideAndConquer(nums, st, ed);
    }
    public static void devideAndConquer(int[] nums, int st, int ed){
        if(st>=ed) return;
        int mid = st + (ed-st)/2;
        devideAndConquer(nums, st, mid);
        devideAndConquer(nums, mid+1, ed);
        conquer(nums, st, mid, ed);
    }

    public static void conquer(int[] nums, int st, int mid, int ed){
        int[] mergedArray = new int[ed-st+1];
        int x = 0;
        int ind1 = st;
        int ind2 = mid+1;
        while(ind1<=mid && ind2<=ed){
            if(nums[ind1]<nums[ind2]) mergedArray[x++] = nums[ind1++];
            else mergedArray[x++] = nums[ind2++];
        }
        while(ind1<=mid) mergedArray[x++] = nums[ind1++];
        while(ind2<=ed) mergedArray[x++] = nums[ind2++];
        for(int i = 0, j = st; i < mergedArray.length; i++, j++){
            nums[j] = mergedArray[i];
        }
    }

}
