import java.util.Scanner;
public class exercise3 {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a integer :");
        int n = scanner.nextInt();
        int firstdigit = n;
        int sum = 0;
        while (n>0){
            int lastdigit = n%10;
            sum += lastdigit;
            n = n/10;
        }
       System.out.println ("The sum of digits:" + sum);
       scanner.close();
    }
}