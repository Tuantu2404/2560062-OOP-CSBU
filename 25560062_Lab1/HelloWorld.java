import java.util.Scanner;
import static java.lang.Math.max;
public class HelloWorld {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
       for (int i=1;i<=3;i++)
       {
        System.out.println("Enter number "+ i +" :");
        int n = scanner.nextInt();
        max = max + n;
        
       }
       System.out.println ("The sum of max:" +max);
        
        scanner.close();
    }
}