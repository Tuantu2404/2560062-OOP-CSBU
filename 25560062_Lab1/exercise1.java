import java.util.Scanner;
import static java.lang.Math.max;
public class exercise1 {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scanner.nextInt();       
        for (int i=0; i<=n;i++)
        {
            if (i%2 ==0)
            {
                System.out.println(i + " -Even");   
        } else {
                System.out.println(i + " -Odd");
            }
        }
        scanner.close();
    }
}