//Exercise 4: Circle Class - Geometry as an Object
class Circle{
  private double CenterX;
  private double CenterY;
  private double radius;
  public Circle(){
   this.CenterX = 0.0;
   this.CenterY = 0.0;
   this.radius = 1.0;
  }
  public Circle(double CenterX, double CenterY, double radius){
    this.CenterX = CenterX;
    this.CenterY = CenterY;
    this.radius = (radius>0)? radius :1.0;
  }
  public double area(){
    return Math.PI *radius*radius;
  }
  public double perimeter(){
    return 2*Math.PI*radius;
  }
  public boolean contains(double x, double y){
    double deltaX = x - this.CenterX;
    double deltaY = y - this.CenterY;
    double distanceSquared = (deltaX * deltaX) + (deltaY * deltaY);
    return distanceSquared <= (this.radius * this.radius);
  }
  public void display(){
    System.out.printf("Center: (%.1f, %.1f), Radius: %.1f, Area: %.2f, Perimeter: %.2f\n",
    CenterX, CenterY, radius, area(), perimeter());
  }
}



class exercise4{
    public static void main(String[]args){
        Circle c1 = new Circle();
        c1.area();
        c1.perimeter();
        c1.display();
        System.out.println("Point (0.5, 0.5) in c1? " + c1.contains(0.5, 0.5)); // true
        System.out.println("Point (2.0, 0.0) in c1? " + c1.contains(2.0, 0.0)); // false

        Circle c2 = new Circle(7.0, 10.0, 15.0);
        c2.area();
        c2.perimeter();
        c2.display();
        System.out.println("Point (7.0, 8.0) in c2? " + c2.contains(7.0, 8.0)); 
     }
}