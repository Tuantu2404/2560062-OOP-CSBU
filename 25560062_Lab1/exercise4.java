  import java.util.Scanner;
  public class exercise4 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = scanner.nextLine();

        String reverse = "";
        for (int i = str.length() -1 ; i>=0;i--)
        {
            reverse = reverse + str.charAt(i);
        }
        System.out.println("The reverse of the string is : " + reverse);
        scanner.close();
    }
  }