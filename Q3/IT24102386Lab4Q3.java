import java.util.Scanner;
public class IT24102386Lab4Q3{
        public static void main (String [] args){
                double number;
                Scanner input=new Scanner(System.in);
                System.out.println("Enter a number:");
                number=input.nextDouble();
                String result=(number>0)?"Positive":
                              (number<0)?"Negative":"Zero";
                System.out.println("The number is :"+result);
      }
}
                