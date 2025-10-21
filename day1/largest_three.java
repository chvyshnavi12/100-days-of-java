package day1;
import java.util.Scanner;

public class largest_three {
    public static int larg(int a,int b, int c){
        if(a>b && a>c){
            return a;
        }
        else if (b>a && b>c){
            return b;
        }
        else{
            return c;
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the three numbers");
        int a,b,c;
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        System.out.println(larg(a,b,c));

    }}
    

