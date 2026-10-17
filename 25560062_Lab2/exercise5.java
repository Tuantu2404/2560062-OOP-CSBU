//Exercise 5: Dice Class - Object State and Repeated Method Calls
import java.util.Scanner;
class Dice{
 private int value;
 public Dice(){
    this.value = 1;
 }
 public int roll(){
    this.value = (int) (Math.random()*6 )+1;
    return this.value;
 }
 public int getvalue(){
    return value;
 }
}

public class exercise5{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        Dice myDice= new Dice();
        System.out.println("How many times you want to roll the dice:");
        int n = scanner.nextInt();
        int[] counts = new int[7];

        for (int i = 0; i < n; i++){
            int result = myDice.roll();
            counts[result]++;
        } 
        System.out.println ("Result of "+n+" times rolling dice:");
        for (int i = 1; i <= 6; i++){
            double probability = (double) counts[i] / n;
            System.out.printf("Face %d: appears %3d times | Frequency: %.2f%%\n", i, counts[i], probability *100);
        }
        scanner.close();
    }
}