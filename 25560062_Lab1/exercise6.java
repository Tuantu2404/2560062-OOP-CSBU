 import java.util.Scanner;
  public class exercise6 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an integer to create the size of array:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Please input " + n + " integers:");
        for (int i=0;i<n;i++)
        {
            array[i] = scanner.nextInt();
        }
        System.out.println("Please input a number to query:");
        int querynumber = scanner.nextInt();
        boolean found = false;
        for (int i=0;i<n;i++)
        {
            if (array[i] == querynumber)
            {
                found = true;
                System.out.println("The number found in place" +  i +" of the array");
                break;
            } 
        }
        if (!found)
        {
        System.out.println("-1");
        }
    scanner.close();
    }
  }