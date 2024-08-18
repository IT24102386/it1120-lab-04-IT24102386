import java.util.Scanner;
public class IT24102386Lab4Q1{
         public static void main(String[]args){
                int number;
                Scanner input=new Scanner(System.in);
                System.out.println("Enter number :");
                number=input.nextInt();
                if(number==0){
                         System.out.println("This number is Zero");
                }
                else if(number>0){
                           System.out.println("This number is Positive");
                }
                else{
                        System.out.println("This number is Negative");
                }
          }
}
            
            