//Exercise 2: Fraction Class - State Validation and Object Operations
class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(){
    this.denominator = 1;
    this.numerator = 0; 
    }
    public Fraction(int numerator, int denominator){
      this.numerator = numerator;
      if (denominator == 0){
        this.denominator = 1;
      }
      else {
       this.denominator = denominator;
      }
    }
    public void simplify(){
    if (this.numerator == 0){
        this.denominator = 1;   //If the numerator=0 this fraction would turn into 0/1 automatically.
        return;
    }
    int a = Math.abs(this.numerator);      //To help the calculating algorithm calculate the negative number correctly.
    int b = Math.abs(this.denominator);
    
    while (b!=0){
        int temp = b;
        b = a % b;      //The euclid algorithm to find the Greatest Common Divisor (GCD).
        a = temp;
    }
    this.numerator /= a;        
    this.denominator /= a;      // Dividing the GCD to whole fraction to simplify it.
    
    if (this.denominator <0){
        this.numerator = -this.numerator;     // Normalize the fraction  
        this.denominator = -this.denominator;// turn the minus sign to the numerator if it at the denominator. 
    }
    }

    public Fraction add(Fraction other){
    int newNumerator = (this.numerator*other.denominator) + (this.denominator*other.numerator);
    int newDenominator = this.denominator*other.denominator;   //Use: a/b + c/d = (a*d)+(b*c) / (b*d)
    return new Fraction(newNumerator, newDenominator);
    }
    public Fraction subtract(Fraction other){
    int newNumerator = (this.numerator*other.denominator) - (this.denominator*other.numerator);
    int newDenominator = this.denominator*other.denominator;   //Use: a/b - c/d = (a*d)-(b*c) / (b*d)
    return new Fraction(newNumerator, newDenominator);
    }
    public Fraction multiply(Fraction other){
     int newNumerator = this.numerator*other.numerator;
     int newDenominator = this.denominator*other.denominator; //Use: a/b * c/d = a*c / b*d
     return new Fraction(newNumerator, newDenominator);
    }
    public Fraction divide(Fraction other){
    int newNumerator = this.numerator*other.denominator;
    int newDenominator = this.denominator*other.numerator; // Use: a/b / c/d = a/b * d/c 
    return new Fraction(newNumerator, newDenominator);
    }
    public void display(){
    System.out.println(this.numerator + "/" + this.denominator); // Just to print out the Fraction.
    }
}
    public class exercise2{
        public static void main(String[] args){
        Fraction f1= new Fraction(2, 1);
        Fraction f2 = new Fraction (3, 4);
        Fraction f3 = new Fraction (10, 5);
        Fraction sum = f1.add(f2);
        Fraction minus = f1.subtract(f2);
        Fraction multiply = f1.multiply(f2);
        Fraction divide = f1.divide(f2);
        f1.display();
        f2.display();
        f3.display();
        f3.simplify();
        System.out.println("Sum result:");
        sum.display();
        System.out.println("Minus result:");
        minus.display();
        System.out.println("Multiply result:");
        multiply.display();
        System.out.println("Divide result:");
        divide.display();
        System.out.println("Simplify of f3:");
        f3.display();
        }
    }
