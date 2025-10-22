import java.util.Scanner;
public class Count_digit {
    public static int counting(int num){
       int count=0;
       while(num!=0){
        count+=1;
        num=num/10;
       }
       return count;
    }
    public static void main(String []args){
Scanner scanner=new Scanner(System.in);
System.out.println("enter the number:");
int num=scanner.nextInt();
System.out.println( counting(num) );

    

}
    
}
