
public class find_large_small {
    public static void large_small(int[] nums){
        int small = nums[0];
        int large = nums[0];

        for (int i : nums) {
            if (i > large) {
                large = i;
            }
            if (i < small) {
                small = i;
            }
        }

        System.out.println("Largest element: " + large);
        System.out.println("Smallest element: " + small);
    }

    public static void main(String[] args){
       int[] nums = {1, 2, 3, 7, 4, 9, 0, 4};
       large_small(nums);
    }
}
