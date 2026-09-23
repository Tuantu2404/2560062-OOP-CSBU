import java.util.Scanner;
   public class exercise8forpluspoint {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the number of times the hero is hit by Quill Spray:  (the number must smaller than 10000)" );
        int n = scanner.nextInt();
        if (n>10000)
        {
            System.exit(0);
        }
        double[] timestamps = new double[n];
        System.out.println("Please input the timestamps of the hero is hit by Quill Spray:  (you should write in the numbers in double)" );
        for (int i=0;i<n;i++)
        {
            timestamps[i] = scanner.nextDouble();
        }
        System.out.println("Please input the base damage of Quill Spray:  (you should write the number in double)");
        double basedamage = scanner.nextDouble();
        System.out.println("Please input the additional damage of Quill Spray:  (you should write the number in double)");
        double additionaldamage = scanner.nextDouble();
        System.out.println("Please input the time interval of Quill Spray:  (you should write the number in double)");
        double timeinterval = scanner.nextDouble();
        double totaldamage = 0;
        for (int i=0;i<n;i++)
        {
            int activequills = 0;
            for (int j=0;j<i;j++)
            {  
                if (timestamps[i]-timestamps[j] <= timeinterval)
                {
                    activequills++;
                }
            }
                    totaldamage = totaldamage + basedamage + (activequills*additionaldamage);
            } 
        System.out.println("The total damage of Quill Spray is: " + (int)totaldamage);
    
    scanner.close();
    }
    }