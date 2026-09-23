import java.util.Scanner;
import static java.lang.Math.max;
public class exercise2 {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
       for (int i=1;i<=3;i++)
       {
        System.out.println("Enter number "+ i +" :");
        int n = scanner.nextInt();
        if (n>max)
        {
            max = n;
        }
       }
       System.out.println ("The largest number:" +max);
        
        scanner.close();
    }
}