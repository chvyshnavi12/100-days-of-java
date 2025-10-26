import java.util.Arrays;
public class rotate_array_by_k {

    public static void rotate_k(int[] nums,int k){
        int n=nums.length;
        int[] arr=new int[n];
        int index;
        int i=0;
        for(index=n-k;index<n;index++){
            arr[i]=nums[index];
            i++;
        }
        for (index=0;index<n-k;index++){
            arr[i]=nums[index];
            i++;
        }
        
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args){
        int[] nums={1,2,3,4,5,6,7};
        int k=4;
        rotate_k(nums,k);
    }
}
