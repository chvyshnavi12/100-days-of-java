
public class find_second_largest {
    public static int second_large(int[] nums){
        int large=Integer.MIN_VALUE;
        int second_large=Integer.MIN_VALUE;
        for(int num:nums){
            if(num>large){
                second_large=large;
                large=num; }
            else if(num>second_large && num!=large){
                second_large=num;

            }

          }  return second_large;


    }
    public static void main(String []args){
        int[] num={1,2,3,4};
        int result=second_large(num);
        System.out.println(result);
    }
    
}
