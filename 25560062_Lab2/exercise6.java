// Exercise 6: Calculator - Method Overloading
class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public double add(double a, double b){
        return a + b;
    }
    public int add(int a, int b, int c){
        return a + b + c;
    }
    public int max(int a, int b){
        return (a > b) ? a : b;
    }
    public double max(double a, double b){
        return (a > b) ? a : b;
    }
}

public class exercise6 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
       
        int sum1 = calc.add(5, 9);
        System.out.println("Calling add(int, int) with 5 and 9 -> Result: " + sum1);
        
        
        double sum2 = calc.add(10.7, 8.6);
        System.out.println("Calling add(double, double) with 10.7 and 8.6 -> Result: " + sum2);
        
        
        int sum3 = calc.add(7, 8, 9);
        System.out.println("Calling add(int, int, int) with 7, 8, 9 -> Result: " + sum3);
        
       
        int max1 = calc.max(10, 15);
        System.out.println("Calling max(int, int) with 10 and 15 -> Max: " + max1);
        
       
        double max2 = calc.max(85.12, 2341.93593);
        System.out.println("Calling max(double, double) with 85.12 and 2341.93593 -> Max: " + max2);
    }
}