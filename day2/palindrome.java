import java.util.Scanner;

public class palindrome {
    public static int reverse(int num){
        int result=0;
        while(num!=0){
            int digit=num%10;
            result=result*10+digit;
            num=num/10;
        }
        return result;
    }
    public static Boolean palindrome(int num){
        int reversed=reverse(num);
        if(reversed==num){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=scanner.nextInt();
        if(palindrome(num)){
            System.out.println("the number is palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }

    
}
