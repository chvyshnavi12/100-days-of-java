import java.util.Arrays;
class reverse_array{
    public static  void reversed(int[] nums){
      int n=nums.length;
      int start=0;
      int end=n-1;
      while(start<end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
        start++;
        end--;
      }
      System.out.println(Arrays.toString(nums));
    }
    public static void main(String []args){
        int[] nums={1,2,3,4};
        reversed(nums);
    }
    
}