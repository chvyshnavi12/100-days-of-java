package day1;
import java.util.Scanner;
class Swap_numbers{
    public void swapping(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" " +b);
        
    }
    public static void main(String []args)
    {
      Swap_numbers obj=new Swap_numbers();
      Scanner scanner=new Scanner(System.in);
      System.out.println("enter the fist number:");
      int a;
      a=scanner.nextInt();
      System.out.println("enter the second number:");
      int b=scanner.nextInt();
      obj.swapping(a,b);
      
    }
}