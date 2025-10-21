package day1;
import java.util.Scanner;
public class vowel_consonent {
    public static Boolean vowel(char a){
        char[] arr={'a','e','i','o','u' };
        for(int i=0;i<arr.length;i++){
            if (arr[i]==a){
                return true;
            }
        }
        return false;
    }
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the letter");
        char a=scanner.next().charAt(0);
        System.out.println(vowel(a));


    }

    
}
