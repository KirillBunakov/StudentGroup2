package Seminar3.domain;

public class Employee extends Worker {
  private String special;

  public Employee(String name, int age, String special) {
    super(name, age);
    this.special = special;
  }
}
