//Exercise 3: Time Class - Maintaining a Valid Object State
class Time {
 private int hour;
 private int minute;
 private int second;

 public Time(){
    this.hour = 0;
    this.minute = 0;
    this.second = 0;
 }
 public Time(int hour, int minute, int second){
    setTime(hour, minute, second);
 }
 public void setTime(int hour, int minute, int second){
    if (hour>=0 && hour<24 && minute>=0 && minute<60 && second>=0 && second < 60){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    else {
       System.out.printf ("Invalid Time input! Set time to 00:00:00");
       this.hour = 0; 
       this.minute = 0;
       this.second = 0;
    }
 }
 public void display(){
    System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
 }
 public void addSecond(int seconds){
    int totalSeconds = this.hour *3600 + this.minute * 60 + this.second;
    totalSeconds += seconds;

    totalSeconds = totalSeconds % 86400;
    if (totalSeconds<0){
        totalSeconds += 86400;
    }
    this.hour = totalSeconds / 3600;
    this.minute = (totalSeconds%3600) / 60;
    this.second = totalSeconds % 60;
 }
 public void subtractSeconds(int seconds){
    addSecond(-seconds);
 }
}

public class exercise3{
    public static void main(String[]args){
        System.out.println("Test 1: 23:59:50 + 20s  ");
        Time t1 = new Time(23, 59, 50);
        t1.display();
        t1.addSecond(20);
        t1.display();


        System.out.println("Test 2: 00:00:10 - 20s");
        Time t2 = new Time(0, 0, 10);
        t2.display();
        t2.subtractSeconds(20);
        t2.display();
    }
}