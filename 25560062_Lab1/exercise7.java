import java.util.Scanner;
  public class exercise7 {
    public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input an integer to adjust the size of first array;");
    int n = scanner.nextInt();
    int[] firstarray = new int[n];
    System.out.println("Please input " + n + " integers from smallest to largest:");
    for (int i=0;i<n;i++)
    {
        firstarray[i] = scanner.nextInt();
    }
    System.out.println("Input an integer to adjust the size of second array;");
    int m = scanner.nextInt();
    int[] secondarray = new int[m];
    System.out.println("Please input " + m + " integers from smallest to largest:");
    for (int i=0;i<m;i++)
    {
        secondarray[i] = scanner.nextInt();
    }
    int[] mergedArray = new int[n + m];
    int i = 0;
    int j = 0;
    int k = 0;
    while (i < n && j < m)
    {

        if (firstarray[i] < secondarray[j])
        {
            mergedArray[k] = firstarray[i];
            i++;
        } else {
            mergedArray[k] = secondarray[j];
            j++;
        }
        k++;
    }
    while (i < n)
    {
        mergedArray[k] = firstarray[i];
        i++;
        k++;
    }
    while (j < m)
    {
        mergedArray[k] = secondarray[j];
        j++;
        k++;
    }
    for (int l=0; l < m+n ;l++)
    {
        System.out.println(mergedArray[l]);
    }
    scanner.close();
    }
  }