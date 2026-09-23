  import java.util.Scanner;
  public class exercise5 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an integer :");
        int n = scanner.nextInt();
        int rootnumber = n;
        for (int i=1;i<=10; i++)
        {
            n = n*i;
            System.out.println(rootnumber+"x"+i+"="+n);
            n = n/i;
        }
        scanner.close();
    }
  }