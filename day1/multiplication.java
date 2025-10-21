package day1;
import java.util.Scanner;
public class multiplication {
    public static void mul(int n){
        for(int i=1;i<11;i++)
        {int result=n*i;
            System.out.println(n+"*"+i+"="+result);
        }
    }
    public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.println("enter a num:");
int n=scanner.nextInt();
mul(n);
    }
    
}
