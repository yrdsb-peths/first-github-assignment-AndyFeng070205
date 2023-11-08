public class Student{
  private String name;
  private int age;
  private int grade;

  public Student(String sName, int sAge, int sGrade){
    name = sName;
    age = sAge;
    grade = sGrade;
  }

  public String getName(){
    return name;
  }

  public String getAge(){
    return age;
  }

  public String getGrade(){
    return grade;
  }

  public String toString(){
    return "name: " + name + " age: " + age + " grade: " + grade;
  }
}
