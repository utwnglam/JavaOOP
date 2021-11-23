package model;

public class Student {
  private String names, gender;
  private int age, ID_NO;

  public Student(String names, int age, String gender, int ID_NO) {
    this.names = names;
    this.age = age;
    this.gender = gender;
    this.ID_NO = ID_NO;
  }

  public String getNames() {
    return names;
  }
  public void setNames(String newNames) {
    names = newNames;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int newAge) {
    age = newAge;
  }
  public String getGender() {
    return gender;
  }
  public void setGender(String newGender) {
    gender = newGender;
  }
  public int getID_NO() {
    return ID_NO;
  }
  public void setID_NO(int newID_NO) {
    ID_NO = newID_NO;
  }
}
