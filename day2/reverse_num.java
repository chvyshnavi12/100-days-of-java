import java.util.Scanner;
class reverse_num{
    public static int reverse(int num){
        int result=0;
        while(num!=0){
            int digit=num%10;
            result=result*10+digit;
            num = num/10;
         }
         
         return result;
}
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number you have to reverse:");
        int num= scanner.nextInt();
        System.out.println((reverse(num)));

    }
}

