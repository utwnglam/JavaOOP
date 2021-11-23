import model.Student;

public class main {
  public static void main(String[] args) {
    String toPrintName = "toPrint";
    Student toPrint = new Student(toPrintName, 99, "F", 999);

    System.out.println(toPrint.getNames());
    System.out.println(toPrint.getAge());
    System.out.println(toPrint.getGender());
    System.out.println(toPrint.getID_NO());
  }
}
