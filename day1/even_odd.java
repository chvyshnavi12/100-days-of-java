package day1;
import java.util.Scanner;

public class even_odd {
    public Boolean even_or_odd(int num){
        if(num%2==0){
            return true;
        }
        else{
            return false;

        }

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        int num=scanner.nextInt();
        even_odd obj=new even_odd();
        Boolean result=obj.even_or_odd(num);
        if(result){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
       

    }}
    

