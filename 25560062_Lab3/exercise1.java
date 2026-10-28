import java.util.ArrayList;
import java.util.List;

class Student{
   private String StudentID;
   private String fullname;
   private String address;
   private int totalcredits;
   private double GPA;


   public Student(String id, String name, String address, int totalcredits, double GPA){
    this.StudentID = id;
    this.fullname = name;
    this.address = address;
    this.totalcredits = totalcredits;
    this.GPA = GPA;
   }
   public String GetStudentID(){return StudentID;}
   public void SetStudentID(String StudentID){this.StudentID = StudentID;}
   public String Getfullname(){return fullname;}
   public void Setfullname(String fullname){this.fullname = fullname;}
   public String Getaddress(){return address;}
   public void Setaddress(String address){this.address = address;}
   public int Gettotalcredits(){return totalcredits;}
   public void Settotalcredits(int totalcredits){this.totalcredits = totalcredits;}
   public double GetGPA(){return GPA;}
   public void SetGPA(double GPA){this.GPA = GPA;}
   public boolean isEligibleForGraduation(){
    return false;
   }
} 
class CollegeStudent extends Student{
 private double graduationExamScore;
 public CollegeStudent(String StudentID, String fullname, String address, int totalcredits, double GPA, double graduationExamScore){
    super(StudentID, fullname, address, totalcredits, GPA);
    this.graduationExamScore = graduationExamScore;
 }
 public double GetgraduationExamScore(){return graduationExamScore;}
 public void SetgraduationExamScore(double graduationExamScore){this.graduationExamScore = graduationExamScore;}
 @Override
 public boolean isEligibleForGraduation(){
    return Gettotalcredits()>= 120 && GetGPA() >=5.0 && GetgraduationExamScore() >=5.0;
 } 
}
class UniversityStudent extends Student{
    private String ThesisTitle;
    private double ThesisScore;
    public UniversityStudent(String StudentID, String fullname, String address, int totalcredits, double GPA, String ThesisTitle , double ThesisScore){
        super(StudentID, fullname, address, totalcredits, GPA);
        this.ThesisScore = ThesisScore;
        this.ThesisTitle = ThesisTitle;
    }
    public double GetThesisScore(){return ThesisScore;}
    public void SetThesisScore(double ThesisScore){this.ThesisScore = ThesisScore;}
    public String GetThesisTitle(){return ThesisTitle;}
    public void SetThesisTitle(String ThesisTitle){this.ThesisTitle = ThesisTitle;}
@Override
 public boolean isEligibleForGraduation(){
    return Gettotalcredits() >= 170 && GetGPA() >= 5.0 && GetThesisScore() >=5.0;
 }
}


public class exercise1 {
  public static void main(String[]args){
    List<Student> studentList = new ArrayList<>();

        studentList.add(new CollegeStudent("C001", "Nguyen Van A", "TP.HCM", 125, 6.5, 7.0));
        studentList.add(new CollegeStudent("C002", "Tran Thi B", "Dong Nai", 130, 6.0, 4.0));
        studentList.add(new UniversityStudent("U001", "Le Van C", "Ha Noi", 165, 8.0, "AI Research", 9.0));
        studentList.add(new UniversityStudent("U002", "Pham Thị D", "Da Nang", 175, 8.5, "Big Data", 8.0));

        int eligibleCount = 0;
        for (Student s : studentList) {
            if (s.isEligibleForGraduation()) {
                eligibleCount++;
            }
        }
        System.out.println("=== 1. KET QUA XET TOT NGHIEP ===");
        System.out.println("Tong so sinh vien du dieu kien tot nghiep: " + eligibleCount);
        System.out.println();

        UniversityStudent maxUniStudent = null;
        double maxGpa = -1.0;

        for (Student s : studentList) {
            if (s instanceof UniversityStudent) {
                UniversityStudent uniStudent = (UniversityStudent) s;
                if (uniStudent.GetGPA() > maxGpa) {
                    maxGpa = uniStudent.GetGPA();
                    maxUniStudent = uniStudent;
                }
            }
        }

        System.out.println("=== 2. TIM SINH VIEN DAI HOC CO GPA CAO NHAT ===");
        if (maxUniStudent != null) {
            System.out.println("Ho ten: " + maxUniStudent.Getfullname());
            System.out.println("Ma SV: " + maxUniStudent.GetStudentID());
            System.out.println("GPA: " + maxUniStudent.GetGPA());
            System.out.println("Ten luan van: " + maxUniStudent.GetThesisTitle());
        } else {
            System.out.println("Khong co sinh vien Dai hoc nao trong danh sach.");
        }
  }
}